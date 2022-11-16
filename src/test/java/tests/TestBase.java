package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import drivers.RealDeviceDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    @BeforeAll
    public static void setup() {
        switch (System.getProperty("device.launch")) {
            case ("local"):
                Configuration.browser = LocalMobileDriver.class.getName();
                Configuration.browserSize = null;
                break;
            case ("real"):
                Configuration.browser = RealDeviceDriver.class.getName();
                Configuration.browserSize = null;
                break;
            case ("remote"):
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                Configuration.browserSize = null;
                break;
        }

    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId().toString();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        if (System.getProperty("device.launch").equals("remote")) {
            Attach.video(sessionId);
        }

    }
}

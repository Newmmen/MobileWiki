package tests.steps;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainScreenTabs {

    public MainScreenTabs openSavedTab() {
        step("Open Saved tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Saved"));
        });

        return this;

    }

    public MainScreenTabs openSearchTab() {
        step("Open Search tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/history_title")).shouldHave(text("History"));
        });

        return this;

    }

    public MainScreenTabs openEditsTab() {
        step("Open Edits tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_edits")).click();
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Edits"));
        });

        return this;

    }

    public MainScreenTabs openMenuTab() {
        step("Open Menu tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/menu_icon")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_login_button")).shouldBe(visible);
            $(AppiumBy.id("org.wikipedia.alpha:id/touch_outside")).click();
        });

        return this;

    }
}

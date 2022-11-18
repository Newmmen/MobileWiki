package tests.steps;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainScreenTabs {

    @Step("Open Saved tab")
    public MainScreenTabs openSavedTab() {
        $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
        $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Saved"));

        return this;

    }

    @Step("Open Search tab")
    public MainScreenTabs openSearchTab() {
        $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/history_title")).shouldHave(text("History"));

        return this;

    }

    @Step("Open Edits tab")
    public MainScreenTabs openEditsTab() {
        $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_edits")).click();
        $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Edits"));

        return this;

    }

    @Step("Open Menu tab")
    public MainScreenTabs openMenuTab() {
        $(AppiumBy.id("org.wikipedia.alpha:id/menu_icon")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_login_button")).shouldBe(visible);
        $(AppiumBy.id("org.wikipedia.alpha:id/touch_outside")).click();

        return this;

    }
}

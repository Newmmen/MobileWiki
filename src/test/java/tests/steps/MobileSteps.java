package tests.steps;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class MobileSteps {
    public MobileSteps skipLanguageAlert() {
        step("Skip language choice", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click());
        return this;

    }

    public MobileSteps checkElementOnPage(String elementName) {
        step("", () ->
                $(AppiumBy.className("android.widget.TextView")).shouldHave(text(elementName)));
        return this;
    }

    public MobileSteps clickOnArticle() {
        step("Click on article", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).first().click());

        return this;
    }

    public MobileSteps checkSearchedArticles() {
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
        return this;
    }


    public MobileSteps searchElement(String elementName) {
        step("Type search {*}", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys(elementName);
        });
        return this;
    }

}

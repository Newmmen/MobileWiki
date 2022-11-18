package tests.steps;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchScreenSteps {

    @Step("Skip language choice")
    public SearchScreenSteps skipLanguageAlert() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        return this;

    }

    @Step("Check element on page")
    public SearchScreenSteps checkElementOnPage(String elementName) {
        step("", () ->
                $(AppiumBy.className("android.widget.TextView")).shouldHave(text(elementName)));
        return this;
    }

    @Step("Check article content")
    public SearchScreenSteps checkArticleView() {
        $(AppiumBy.className("android.webkit.WebView")).shouldBe(visible);
        return this;
    }

    @Step("Click on article")
    public SearchScreenSteps clickOnArticle() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).first().click();

        return this;
    }

    @Step("Verify content found")
    public SearchScreenSteps checkSearchedArticles() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Type search")
    public SearchScreenSteps searchElement(String elementName) {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                .sendKeys(elementName);
        return this;
    }

}

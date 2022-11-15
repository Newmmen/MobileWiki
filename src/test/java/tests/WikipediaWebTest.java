package tests;

import org.junit.jupiter.api.Test;
import tests.steps.MobileSteps;

public class WikipediaWebTest extends TestBase {
    MobileSteps mobileSteps = new MobileSteps();

    @Test
    void checkSearchWiki() {
        mobileSteps
                .skipLanguageAlert()
                .searchElement("BrowserStack")
                .checkSearchedArticles();
    }
    
    @Test
    void checkArticleOpening() {
        String element = "Appium";
        mobileSteps
                .skipLanguageAlert()
                .searchElement(element)
                .checkSearchedArticles()
                .clickOnArticle()
                .checkArticleView();

    }
}




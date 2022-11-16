package tests;

import org.junit.jupiter.api.Test;
import tests.steps.MainScreenTabs;
import tests.steps.SearchScreenSteps;

public class WikipediaWebTest extends TestBase {
    SearchScreenSteps searchScreenSteps = new SearchScreenSteps();
    MainScreenTabs mainScreenTabs = new MainScreenTabs();

    @Test
    void checkSearchWiki() {
        searchScreenSteps
                .skipLanguageAlert()
                .searchElement("BrowserStack")
                .checkSearchedArticles();
    }

    @Test
    void checkArticleOpening() {
        String element = "Appium";
        searchScreenSteps
                .skipLanguageAlert()
                .searchElement(element)
                .checkSearchedArticles()
                .clickOnArticle()
                .checkArticleView();

    }

    @Test
    void checkAllMainTabs() {
        searchScreenSteps
                .skipLanguageAlert();
        mainScreenTabs
                .openSavedTab()
                .openEditsTab()
                .openSearchTab()
                .openMenuTab();
    }

}




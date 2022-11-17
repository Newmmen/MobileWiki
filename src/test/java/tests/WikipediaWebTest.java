package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.steps.MainScreenTabs;
import tests.steps.SearchScreenSteps;

public class WikipediaWebTest extends TestBase {
    SearchScreenSteps searchScreenSteps = new SearchScreenSteps();
    MainScreenTabs mainScreenTabs = new MainScreenTabs();

    @DisplayName("Check searching an article")
    @Test
    void checkSearchWiki() {
        searchScreenSteps
                .skipLanguageAlert()
                .searchElement("BrowserStack")
                .checkSearchedArticles();
    }

    @DisplayName("Check opening an article")
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

    @DisplayName("Check All tabs on main page")
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




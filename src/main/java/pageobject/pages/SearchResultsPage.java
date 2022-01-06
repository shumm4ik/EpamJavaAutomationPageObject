package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchResultsPage extends BasePage {

    private static final String SEARCH_RESULTS_PRODUCTS_LIST_TEXT = "//div[@class='prod-cart__descr']";

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsList() {
        return driver.findElements(xpath(SEARCH_RESULTS_PRODUCTS_LIST_TEXT));
    }// возращаемый тип List<WebElement> потому что при помощи метода findElements мы получаем список элементов по заданному икспасу
}

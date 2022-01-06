package pageobject.pages;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage {

    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    private static final String PRODUCT_CATALOG_BUTTON = "//span[@class='sidebar-item']";
    private static final String APPLE_STORE_BUTTON = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]";
    private static final String AMOUNT_OF_PRODUCTS_IN_CART = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        driver.findElement(xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(xpath(SEARCH_BUTTON)).click();
    }

    public void clickOnProductCatalogButton() {
        driver.findElement(xpath(PRODUCT_CATALOG_BUTTON)).click();
    }

    public void clickOnAppleStoreButton() {
        driver.findElement(xpath(APPLE_STORE_BUTTON)).click();
    }

    public String getTextOfAmountProductsInCart() {
        return driver.findElement(xpath(AMOUNT_OF_PRODUCTS_IN_CART)).getText();
    } //возвращаемый тип String потому что мы получаем текст из элемента
}

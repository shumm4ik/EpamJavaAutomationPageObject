package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class IphonePage extends BasePage {

    private static final String ADD_TO_CART_BUTTON = "//a[@class='prod-cart__buy']";
    private static final String ADD_TO_CART_POPUP = "js_cart";
    private static final String CONTINUE_SHOPPING_BUTTON = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]";

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        driver.findElements(xpath(ADD_TO_CART_BUTTON)).get(0).click();
    }

    public void clickOnContinueShoppingButton() {
        driver.findElement(xpath(CONTINUE_SHOPPING_BUTTON)).click();
    }

    public By getAddToCartPopup() {
        return id(ADD_TO_CART_POPUP);
    } //возвращаемый тип By потому что мы возвращаем элемент
}

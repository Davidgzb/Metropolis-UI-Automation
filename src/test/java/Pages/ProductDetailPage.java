package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends PageObject {

    @FindBy(xpath = "//div[3]/div[2]/button")
    private WebElement sizeDropdown;

    @FindBy(xpath = "//div[3]/div[2]/ul/li[2]")
    private WebElement secondItemDropdown;

    @FindBy(xpath = "//div[4]/button[1]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[3]/div[5]/div[3]/div/div/a[1]")
    private WebElement placeOrderButton;

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public void openDropdown(){
        sizeDropdown.click();
    }

    public void selectSecondSize(){
        secondItemDropdown.click();
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public void placeOrder(){
        placeOrderButton.click();
    }
}

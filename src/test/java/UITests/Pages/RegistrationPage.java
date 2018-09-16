package UITests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject{


    @FindBy(className = "cesta-btn")
    private WebElement shoppingBasketButton;

    @FindBy(xpath = "//div[contains(@class, 'marca') and contains(@class, 'ui-text-2')]")
    private WebElement firstItemInCartBrand;

    @FindBy(xpath = "//span[contains(@class, 'titulo') and contains(@class, 'ui-text-2')]")
    private WebElement firstItemInCartModel;

    @FindBy(xpath = "//div[contains(@class, 'talla') and contains(@class, 'ui-text-2')]")
    private WebElement firstItemInCartSize;

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public void clickShoppingBasket(){
        shoppingBasketButton.click();
    }

    public String getFirstItemInCartBrand(){
       String itemBrand = firstItemInCartBrand.getText();
       return itemBrand;
    }

    public String getFirstItemInCartModel(){
        String itemModel = firstItemInCartModel.getText();
        return itemModel;
    }

    public String getFirstItemInCartSize(){
        String itemSize = firstItemInCartSize.getText();
        itemSize = itemSize.substring(6);

        return itemSize;
    }
}

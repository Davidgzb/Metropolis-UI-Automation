package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject{


    @FindBy(xpath = "asdasd")
    private WebElement shoppingBasketButton;

    @FindBy(xpath = "asdasda")
    private WebElement firstItemInCartModel;

    @FindBy(xpath = "asdasdsa")
    private WebElement firstItemInCartBrand;

    @FindBy(xpath = "asdasd")
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
        return itemSize;
    }
}

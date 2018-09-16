package UITests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageObject {


    @FindBy(xpath = "//li[2]/div/div/a[2]")
    private WebElement secondItem;

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public void clickOnSecondItem(){
        secondItem.click();
    }

    public String getItemName(){

        String shoeModel = secondItem.getText();

        return shoeModel;
    }

}

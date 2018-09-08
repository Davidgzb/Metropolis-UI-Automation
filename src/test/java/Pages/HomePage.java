package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {


    @FindBy(xpath = "//nav/div[11]")
    private WebElement searchButton;

    @FindBy(className = "iBuscar")
    private WebElement searchTextBox;

    @FindBy(xpath = "//div[4]/form/button")
    private WebElement enterButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearch(){
        searchButton.click();
    }

    public void enterSearch(String searchQuery){

        searchTextBox.click();
        searchTextBox.sendKeys(searchQuery);

    }

    public void submitSearch(){
        enterButton.submit();
    }

}

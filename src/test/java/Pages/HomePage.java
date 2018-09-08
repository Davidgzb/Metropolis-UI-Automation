package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage extends PageObject {


    @FindBy(className = "JS-buscar-btn buscar-btn")
    private WebElement searchButton;

    @FindBy(className = "iBuscar")
    private WebElement searchTextBox;

    @FindBy(className = "new-btnBuscar js-send-buscar-mobile spritez flecha-buscar")
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
        enterButton.click();
    }

}

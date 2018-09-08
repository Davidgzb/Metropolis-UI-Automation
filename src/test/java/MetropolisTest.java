import Pages.HomePage;
import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MetropolisTest extends DriverConfiguration {


    @Test
    public void AssertItemInCart() throws InterruptedException {

        String searchTerm = "adidas";


        driver.get("https://www.zatro.es/");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSearch();
        homePage.enterSearch(searchTerm);
        homePage.submitSearch();

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        String itemName = searchResultPage.getItemName();
        System.out.println(itemName);
        searchResultPage.clickOnSecondItem();

        //Thread.sleep(10000);


    }
}

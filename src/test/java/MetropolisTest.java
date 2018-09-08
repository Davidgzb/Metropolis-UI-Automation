import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.SearchResultPage;
import org.testng.annotations.Test;

public class MetropolisTest extends DriverConfiguration {


    @Test
    public void AssertItemInCart() throws InterruptedException {

        String searchTerm = "adidas";
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);

        driver.get("https://www.zatro.es/");
        homePage.clickOnSearch();
        homePage.enterSearch(searchTerm);
        homePage.submitSearch();

        String itemName = searchResultPage.getItemName();
        System.out.println(itemName);
        searchResultPage.clickOnSecondItem();

        productDetailPage.openDropdown();
        productDetailPage.selectSecondSize();
        productDetailPage.addToCart();
        productDetailPage.placeOrder();

        //Thread.sleep(10000);


    }
}

package UITests;

import UITests.DriverConfiguration;
import UITests.Pages.HomePage;
import UITests.Pages.ProductDetailPage;
import UITests.Pages.RegistrationPage;
import UITests.Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMetropolis extends DriverConfiguration {


    @Test
    public void AssertItemInCart() {

        String searchTerm = "Adidas";
        String baseUrl = "https://www.zatro.es/";
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);


        // 1. Go to zatro.es
        driver.get(baseUrl);

        // 2. Click the Search Button
        homePage.clickOnSearch();

        // 3. Search for Adidas
        homePage.enterSearch(searchTerm);
        homePage.submitSearch();

        // 4. Click the second item
        String itemName = searchResultPage.getItemName();
        searchResultPage.clickOnSecondItem();

        // 5. Select the second available Shoe Size
        productDetailPage.openDropdown();
        String shoeSize = productDetailPage.getShoeSize();
        productDetailPage.selectSecondSize();

        // 6. Add it to Shopping Cart
        productDetailPage.addToCart();

        // 7. Click tramitar Pedido
        productDetailPage.placeOrder();

        // 8. Then click on Mi Cesta
        registrationPage.clickShoppingBasket();

        // 9. Assert that the item on the basket is the same as you clicked
        Assert.assertEquals(searchTerm, registrationPage.getFirstItemInCartBrand());
        Assert.assertEquals(itemName, registrationPage.getFirstItemInCartModel());
        Assert.assertEquals(shoeSize, registrationPage.getFirstItemInCartSize());


    }
}

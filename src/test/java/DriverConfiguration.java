import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverConfiguration {

    protected static WebDriver driver;

    @BeforeSuite
    public static void setUp(){

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @AfterTest
    public void cleanUp(){

        driver.manage().deleteAllCookies();

    }

    @AfterSuite
    public void closeDriver(){

        driver.close();

    }

}

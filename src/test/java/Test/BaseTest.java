package Test;

import Drivers.CustomDriver;
import Page.SebCalculatorOfLeasingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest
{
    public static WebDriver driver;
    public static SebCalculatorOfLeasingPage _sebCalculatorOfLeasingPage;

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = CustomDriver.GetChromeDriver();
        _sebCalculatorOfLeasingPage = new SebCalculatorOfLeasingPage(driver);
    }

    @After
    public void tearDown()
    {
        //driver.quit();
    }
}

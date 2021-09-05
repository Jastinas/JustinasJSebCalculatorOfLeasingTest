package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CustomDriver
{
    public static WebDriver GetChromeDriver()
    {
        return GetDriver(Browsers.Chrome);
    }
    public static WebDriver FirefoxDriver()
    {
        return GetDriver(Browsers.Firefox);
    }

    private static WebDriver GetDriver(Browsers browserName)
    {
        WebDriver driver = null;

        switch (browserName)
        {
            case Chrome:
                driver = new ChromeDriver();
                break;
            case Firefox:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}


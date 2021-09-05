package Page;

import org.openqa.selenium.WebDriver;

public class BasePage
{
    protected static WebDriver Driver;
    public BasePage(WebDriver webDriver)
    {
        Driver = webDriver;
    }
}

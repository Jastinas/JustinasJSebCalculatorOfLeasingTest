package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SebCalculatorOfLeasingPage extends BasePage
{
    private final String PageAdress = "https://www.seb.lt/eng/private/calculator-leasing";

    public SebCalculatorOfLeasingPage(WebDriver webDriver)
   {
    super(webDriver);
    }

    public SebCalculatorOfLeasingPage NavigateToDefaultPage()
    {
        if (Driver.getCurrentUrl() != PageAdress)
        {
            Driver.get(PageAdress);
        }
        return this;
    }

    public  SebCalculatorOfLeasingPage DisableCookies()
    {
       WebElement cookies = Driver.findElement(By.cssSelector(".accept-selected"));
       cookies.click();
       return this;
    }

    public SebCalculatorOfLeasingPage SwithFrames()
    {
        Driver.switchTo().frame("calculator-frame-06");
        return this;
    }

    public SebCalculatorOfLeasingPage InputPurchaseValue(String value)
    {
        WebElement purchaseValue = Driver.findElement(By.cssSelector("#f-summa"));
        purchaseValue.sendKeys(value);
        return this;
    }

    public SebCalculatorOfLeasingPage InputInterestRate(String value)
    {
        WebElement interestRate = Driver.findElement(By.cssSelector("#f-likme"));
        interestRate.clear();
        interestRate.sendKeys(value);
        return this;
    }

    public SebCalculatorOfLeasingPage PaymentTermDropDown(int paymentTerm)
    {
        WebElement paymentTermDropDown = Driver.findElement(By.cssSelector("#f-termins"));
        paymentTermDropDown.click();
        if (paymentTerm == 1) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(1)")).click();
        } else if (paymentTerm == 2) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(2)")).click();
        } else if (paymentTerm == 3) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(3)")).click();
        } else if (paymentTerm == 4) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(4)")).click();
        } else if (paymentTerm == 5) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(5)")).click();
        } else if (paymentTerm == 6) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(6)")).click();
        } else if (paymentTerm == 7) {
            Driver.findElement(By.cssSelector("#f-termins > option:nth-child(7)")).click();
        }
        return this;
    }

    public SebCalculatorOfLeasingPage FirstInstallmentDropDown(int firstInstallment)
    {
        WebElement firstInstallmentDropDown = Driver.findElement(By.cssSelector("#f-maksa-type"));
        firstInstallmentDropDown.click();
        if (firstInstallment == 1)
        {
            Driver.findElement(By.cssSelector("#f-maksa-type > option:nth-child(1)")).click();
        }
        if (firstInstallment == 2)
        {
            Driver.findElement(By.cssSelector("#f-maksa-type > option:nth-child(2)")).click();
        }
        return this;
    }

    public SebCalculatorOfLeasingPage FirstInstallment(String value)
    {
        WebElement firstInstallment = Driver.findElement(By.cssSelector("#f-maksa"));
        firstInstallment.sendKeys(value);
        return this;
    }

    public SebCalculatorOfLeasingPage CalculateButton()
    {
        WebElement calculateButton = Driver.findElement(By.cssSelector(".btn-dark"));
        calculateButton.click();
        return this;
    }

    public SebCalculatorOfLeasingPage AssertMonthlyPayments(String value)
    {
        WebElement monthlyPayments = Driver.findElement(By.cssSelector("body > div > form > fieldset > div > div.col.col-xs-12.col-md-6.col-print-6.js-results-info.form-column.form-column-equal > div:nth-child(4) > div.col.col-xs-6.col-sm-4.col-input > span.calc-result"));
        String actualValue = monthlyPayments.getText();
        String expectedValue = value;
        Assert.assertEquals(expectedValue, actualValue);
        return this;
    }

    public SebCalculatorOfLeasingPage AddForComparisonButton(String value)
    {
        WebElement addForComparisonButton = Driver.findElement(By.cssSelector(".btn-light"));
        addForComparisonButton.click();
        WebElement totalPayment = Driver.findElement(By.cssSelector("body > div > div.js-comparison-table.calc-results.calc-comparison > table > tbody > tr > td:nth-child(8)"));
        String actualValue = totalPayment.getText();
        String expectedValue = value;
        Assert.assertEquals(expectedValue, actualValue);
        return this;
    }

    public SebCalculatorOfLeasingPage PaymentSchedule(String value)
    {
        WebElement paymentScheduleButton = Driver.findElement(By.cssSelector("button.btn:nth-child(2)"));
        paymentScheduleButton.click();
        WebElement monthlyPayment = Driver.findElement(By.cssSelector("body > div > div.js-results-table.calc-results > table > tbody > tr.subtotal > td:nth-child(6)"));
        String actualValue = monthlyPayment.getText();
        String expectedValue = value;
        Assert.assertEquals(expectedValue, actualValue);
        return this;
    }
}


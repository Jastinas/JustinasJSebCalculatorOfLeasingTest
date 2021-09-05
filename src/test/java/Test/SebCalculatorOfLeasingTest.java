package Test;

import org.junit.Test;

public class SebCalculatorOfLeasingTest extends BaseTest
{
    @Test
    public void CalculatorTest()
    {
        _sebCalculatorOfLeasingPage.NavigateToDefaultPage().DisableCookies().SwithFrames().InputPurchaseValue("20000")
                .InputInterestRate("2.10").PaymentTermDropDown(5).FirstInstallmentDropDown(2).FirstInstallment("4000")
                .CalculateButton().AssertMonthlyPayments("281.14");
    }

    @Test
    public void ComparisonTest()
    {
        _sebCalculatorOfLeasingPage.NavigateToDefaultPage().DisableCookies().SwithFrames().InputPurchaseValue("20000")
                .InputInterestRate("2.10").PaymentTermDropDown(5).FirstInstallmentDropDown(2).FirstInstallment("4000")
                .CalculateButton().AddForComparisonButton("281.14");
    }

    @Test
    public void PaymentSchedule()
    {
        _sebCalculatorOfLeasingPage.NavigateToDefaultPage().DisableCookies().SwithFrames().InputPurchaseValue("20000")
                .InputInterestRate("2.10").PaymentTermDropDown(5).FirstInstallmentDropDown(2).FirstInstallment("4000")
                .CalculateButton().PaymentSchedule("20868.68");
    }

}

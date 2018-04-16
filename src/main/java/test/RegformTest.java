package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegformTest {

    WebDriver driver = new ChromeDriver();

    @Test(groups = {"unit"})

    public void regformTest(){
        RegformPage regform = new RegformPage(driver);
        regform.navigateToUrl("https://www.solarwinds.com/network-performance-monitor/registration");
        ConfirmationPage confirmation = regform.submitRegform("Wendy", "Villegas",
                "Solarwinds", "wendyTestAutomation@solarwinds.com", "1234567890");
        Assert.assertNotNull(confirmation);
        confirmation.close();

    }

}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegformTest {

    //WebDriver driver = new ChromeDriver();

    @Test(groups = {"unit"})
    @Parameters({ "name", "lastName", "company", "email", "phone", "browser", "referred" })

    public void regformTest(String name, String lastName, String company, String email, String phone, String browser, String referred){
        RegformPage regform = new RegformPage(browser);
        regform.navigateToUrl("https://www.solarwinds.com/network-performance-monitor/registration");
        ConfirmationPage confirmation = regform.submitRegform(name, lastName,
                company, email, phone, referred);

        Assert.assertEquals(confirmation.title, "Download Network Performance Monitor");
        confirmation.close();


    }
    @Test(groups = {"fail"})
    @Parameters({ "name","email", "phone", "browser"})
    public void regformTestFail(String name, String email, String phone, String browser){

        RegformPage regform = new RegformPage(browser);
        regform.navigateToUrl("https://www.solarwinds.com/network-performance-monitor/registration");
        regform.failRegformSubmit(name,email,phone);
        regform.close();
    }

}

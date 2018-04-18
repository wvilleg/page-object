package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegformTest {

    //WebDriver driver = new ChromeDriver();

    @Test(groups = {"unit"})
    @Parameters({ "name", "lastName", "company", "email", "phone", "browser" })

    public void regformTest(String name, String lastName, String company, String email, String phone, String browser){
        RegformPage regform = new RegformPage(browser);
        regform.navigateToUrl("https://www.solarwinds.com/network-performance-monitor/registration");
        ConfirmationPage confirmation = regform.submitRegform(name, lastName,
                company, email, phone);

        System.out.println("variable en regform test" + confirmation.title);
        //ssert.assertNotNull(confirmation);
        Assert.assertEquals(confirmation.title, "Download Network Performance Monitor");
        //Assert.assertEquals(confirmation.url,"https://www.solarwinds.com/network-performance-monitor/confirmation?parentCampaign=70150000000Dlbw");
        confirmation.close();


    }

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegformPage extends PageObject{
    By name = By.id("ci_firstName");
    By lastName = By.id("ci_lastName");
    By company = By.id("ci_company");
    By email = By.id("ci_email");
    By phone = By.id("ci_phone");
    By submitbtn = By.id("regFormSubmit");


    public RegformPage(WebDriver driver){
        super(driver);
    }

    public void navigateToUrl(String Url){
        driver.navigate().to(Url);
    }

    public ConfirmationPage submitRegform(String pname, String plastName, String pcompany,
                                          String pemail, String pphone){

        driver.findElement(name).sendKeys(pname);
        driver.findElement(lastName).sendKeys(plastName);
        driver.findElement(company).sendKeys(pcompany);
        driver.findElement(email).sendKeys(pemail);
        driver.findElement(phone).sendKeys(pphone);
        driver.findElement(submitbtn).click();

        return new ConfirmationPage(driver);

    }




}

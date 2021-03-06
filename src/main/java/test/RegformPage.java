package test;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;

public class RegformPage extends PageObject{

    @FindBy(id="ci_firstName")
    private WebElement name;
    @FindBy(id="ci_lastName")
    private WebElement lastName;
    @FindBy(id="ci_company")
    private WebElement company;
    @FindBy(id="ci_email")
    private WebElement email;
    @FindBy(id="ci_phone")
    private WebElement phone;
    @FindBy(id="regFormSubmit")
    private WebElement submitbtn;
    @FindBy(id = "ci_country")
    private WebElement country;
    @FindBy (id = "yes")
    private WebElement referredYes;
    @FindBy(id = "ci_reseller")
    private WebElement referred;
    @FindBy(id = "ci_lastName-error")
    private WebElement lastNameError;
    @FindBy(id = "ci_company-error")
    private WebElement companyError;



    public RegformPage(String driver){
        super(driver);
    }

    public void navigateToUrl(String Url){
        driver.navigate().to(Url);
    }

    public WebElement getCountry() {
        return country;
    }

    public void setCountry(WebElement country) {
        this.country = country;
    }

    public void setCountryCode(){

    }

    public void failRegformSubmit(String pname, String pemail, String pphone, String pcountry){

        name.sendKeys(pname);
        email.sendKeys(pemail);
        phone.sendKeys(pphone);
        country.sendKeys(pcountry);
        submitbtn.click();
        Assert.assertEquals(lastNameError.getText() , "Please provide a last name");
        Assert.assertEquals(companyError.getText(), "Please provide a company name");

    }

    public ConfirmationPage submitRegform(String pname, String plastName, String pcompany,
                                          String pemail, String pphone, String preferred, String pcountry){

        name.sendKeys(pname);
        lastName.sendKeys(plastName);
        company.sendKeys(pcompany);
        email.sendKeys(pemail);
        phone.sendKeys(pphone);
        country.sendKeys(pcountry);
        referredYes.click();
        referred.sendKeys(preferred);
        submitbtn.click();
        return new ConfirmationPage(this.driver);

    }






}

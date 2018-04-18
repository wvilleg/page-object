package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegformPage extends PageObject{

    @FindBy(id="ci_firstName")
    private WebElement name;

    //By name = By.id("ci_firstName");
    @FindBy(id="ci_lastName")
    private WebElement lastName;
    //By lastName = By.id("ci_lastName");
    @FindBy(id="ci_company")
    private WebElement company;
    //By company = By.id("ci_company");
    @FindBy(id="ci_email")
    private WebElement email;
    //By email = By.id("ci_email");
    @FindBy(id="ci_phone")
    private WebElement phone;
    //By phone = By.id("ci_phone");
    @FindBy(id="regFormSubmit")
    private WebElement submitbtn;
    //By submitbtn = By.id("regFormSubmit");


    public RegformPage(String driver){
        super(driver);
    }

    public void navigateToUrl(String Url){
        driver.navigate().to(Url);
    }

    public ConfirmationPage submitRegform(String pname, String plastName, String pcompany,
                                          String pemail, String pphone){

        name.sendKeys(pname);
        lastName.sendKeys(plastName);
        company.sendKeys(pcompany);
        email.sendKeys(pemail);
        phone.sendKeys(pphone);
        submitbtn.click();

        return new ConfirmationPage(this.driver);

    }






}

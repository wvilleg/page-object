package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ConfirmationPage extends PageObject{
    @FindBy(xpath="btnGreen downloadbtn solarTrack")
    public WebElement downloadbtn;




    public ConfirmationPage(String driver){
        super(driver);

    }

    public ConfirmationPage(WebDriver instanceDriver){
        super(instanceDriver);

    }


}

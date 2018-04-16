package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends PageObject{
    By downloadbtn = By.className("btnGreen downloadbtn solarTrack");

    public ConfirmationPage(WebDriver driver){
        super(driver);
    }
}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    public WebDriver driver;
    public String browser;

    public PageObject(String  pdriver){

        if (pdriver.contentEquals("Chrome")){
            this.driver = new ChromeDriver();
            this.browser = pdriver;
        }

        PageFactory.initElements(driver, this);
    }

    public void close(){
        driver.quit();
    }
}

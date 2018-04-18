package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class PageObject {
    public WebDriver driver;
    public String browser;
    public String title;
    public String url;

    public PageObject(String  pdriver){

        if (pdriver.contentEquals("Chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            this.driver = new ChromeDriver(options);
            this.browser = pdriver;
            this.title = this.driver.getTitle();
            this.url = this.driver.getCurrentUrl();
        }

        PageFactory.initElements(driver, this);

    }

    public PageObject(WebDriver instanceDriver){
        this.driver = instanceDriver;
        this.title = driver.getTitle();
        System.out.println("antes del init" + driver.getTitle());
        PageFactory.initElements(driver, this);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("desp del init" + driver.getTitle());
        this.title = driver.getTitle();
        this.url = driver.getCurrentUrl();
        System.out.println("variable url" + this.url);
    }

    public void close(){
        driver.quit();
    }


}

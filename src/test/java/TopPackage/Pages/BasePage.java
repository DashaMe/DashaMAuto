package TopPackage.Pages;

import TopPackage.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(driver,this);
    }

    static protected WebDriver  driver;
    static {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Constants.BASE_URL);
        driver.manage().window().maximize();
    }
}

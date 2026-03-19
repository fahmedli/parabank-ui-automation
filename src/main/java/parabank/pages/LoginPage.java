package parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import parabank.driver.Driver;
import parabank.config.ConfigReader;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() {
        String url = ConfigReader.getProperty("url");
        driver.get(url);
    }
}
package Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static WebDriver driver;

    public static void launch(String browserName) {
        switch (browserName) {
            case "firefox": {

                driver = new FirefoxDriver();
                break;
            }
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions =new ChromeOptions();
                chromeOptions.setHeadless(true);
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            default:
                throw new IllegalArgumentException("The browser" + browserName + "does not support");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }

    }
}

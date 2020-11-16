package pages;

/**
 * Suffix for location naming
 * txt --> text box
 * btn --> button
 * lbl --> label
 * lnk --> link text
 * rad --> radio button
 * chk --> checkbox
 * dropdown -> drop down
 * ....
 */
import Browsers.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Browser.getDriver();
    }
    public abstract void open();

    public WebElement find(How how, String locator){
        return driver.findElement(how.buildBy(locator));
    }

    public WebElement find(By locator){
        return driver.findElement(locator) ;
    }

    public void check(How how, String locator) {
        if (!find(how, locator).isSelected()) {
            click(how, locator);
        }
    }

    public void check(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void click(How how, String locator){
        find(how,locator).click();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void fill(How how, String locator, String withText){
        find(how,locator).clear();
        find(how,locator).sendKeys(withText);
    }

    public void fill(By locator, String withText){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(withText);
    }
}

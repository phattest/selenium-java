package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsTest {
    @Test
    void validateAlertDisplayed(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();

        String result = driver.findElement(By.id("result")).getText().trim();
        Assert.assertEquals(result, "You successfuly clicked an alert");

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

    }
}

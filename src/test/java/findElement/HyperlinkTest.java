package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HyperlinkTest {
    @Test
    void checkHyperlink(){
        WebDriverManager.chromedriver().setup();
        String baseurl = "https://the-internet.herokuapp.com/status_codes";
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);

        driver.findElement(By.linkText("200")).click();
        //driver.findElement(By.xpath("//a[@href='status_codes/200']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseurl + "/200");
        //navigate to homepage
        driver.findElement(By.linkText("here")).click();// driver.navigate().back();


        driver.findElement(By.linkText("301")).click();
        //driver.findElement(By.xpath("//a[@href='status_codes/200']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseurl + "/301");
        //navigate to homepage
        driver.findElement(By.linkText("here")).click();
        driver.quit();
    }
}

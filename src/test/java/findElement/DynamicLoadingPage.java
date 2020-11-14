package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingPage {
    @Test
    void LoadPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.findElement(By.xpath("//button[.='Start']")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        /**Style display = none in Html**/
        String finished = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")))
                .findElement(By.tagName("h4")).getText().trim();
        /**String finished = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")))
                .findElement(By.tagName("h4")).getText().trim();
         **/
        //Thread.sleep(10000);
        //String finished = driver.findElement(By.xpath("//*[@id='finish']/h4")).getText().trim();
        Assert.assertEquals(finished,"Hello World!");
    }
}

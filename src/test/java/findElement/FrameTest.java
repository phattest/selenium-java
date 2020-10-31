package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest {
    @Test
    void validateFrame(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");


        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String body = driver.findElement(By.xpath("html/body")).getText().trim();
        System.out.println(body);
        Assert.assertEquals(body,"LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String body1 = driver.findElement(By.xpath("html/body")).getText().trim();
        System.out.println(body1);
        Assert.assertEquals(body1,"MIDDLE");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        String body2 = driver.findElement(By.xpath("html/body")).getText().trim();
        System.out.println(body2);
        Assert.assertEquals(body2,"RIGHT");

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-bottom");
        String body3 = driver.findElement(By.xpath("html/body")).getText().trim();
        System.out.println(body3);
        Assert.assertEquals(body3,"BOTTOM");

        driver.quit();
    }
}

package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkboxTest {

    @Test
    void verifyCheckboxes(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /**driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if (checkbox1.isSelected()){
            checkbox1.click();
        }

        Assert.assertTrue(checkbox1.isSelected());

        if (checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox2.isSelected());

         **/

        driver.quit();
    }
    private void check(WebElement element){

    };
}

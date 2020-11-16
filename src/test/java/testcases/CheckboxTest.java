package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest{
    @Test
    void validateCheckBoxesChecked() {
        CheckboxPage checkboxPage = new CheckboxPage();
        checkboxPage.open();
        checkboxPage.checkOn("1");
        Assert.assertTrue(checkboxPage.getCheckbox("1").isSelected());
    }
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
*/
        /*if (checkbox1.isSelected()){
            checkbox1.click();
        }

        Assert.assertTrue(checkbox1.isSelected());
        if (checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox2.isSelected());
*/

}

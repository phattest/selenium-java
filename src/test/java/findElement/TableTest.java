package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
    @Test
    void largestDuePerson(){
        WebDriverManager.chromedriver().setup();
        String baseURL = "https://the-internet.herokuapp.com/tables";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        //List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table 1']/tbody/tr/td[4]"));
/**
        List<Float> dues =  dueColumn
                .stream()
                .map(element -> {
                    return Float.valueOf(element.getText().trim().replace("$",""));
                })
                .collect(Collectors.toList());
        String firstNameLocator = "//table[@id='table 1']/tbody/tr[]/td[2]";
        String lastNameLocator = "//table[@id='table 1']/tbody/tr[]/td[1]";
**/
        //List<Person> persons = rows.stream();
    }
}

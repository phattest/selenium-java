package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static Browsers.Browser.launch;
import static Browsers.Browser.quit;

public class BaseTest {

    @Parameters({"browserName"})
    @BeforeTest
    void setup(String browserName){
        launch(browserName);
    }

    @AfterTest
    void tearDown(){
        quit();
    }
}

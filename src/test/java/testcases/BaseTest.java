package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static Browsers.Browser.launch;
import static Browsers.Browser.quit;

public class BaseTest {

    @Parameters({"browserName"})
    @BeforeClass
    void setup(String browserName){
        launch(browserName);
    }

    @AfterClass
    void tearDown(){
        quit();
    }
}

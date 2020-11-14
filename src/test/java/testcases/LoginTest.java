package findElement;

import Browsers.Browser;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;


public class loginTest {
    @Parameters({"browserName"})
    @BeforeMethod
    void setup(String browserName){
        Browser.launch(browserName);
    }
    @Test
    //void withValidCredenticals(String browserName) {
    void withValidCredenticals() {
        //Browser.launch(browserName);
        LoginPage loginpage = new LoginPage();
        loginpage.open();
        loginpage.login("tomsmith","SuperSecretPassword!");

        Assert.assertEquals(
                loginpage.getCurrentUrl(),
                "https://the-internet.herokuapp.com/secure",
                "Login Failed leu leu!");

        Browser.quit();
    }
}

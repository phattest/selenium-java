package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest{

    @Test
    void withValidCredenticals() {
        LoginPage loginpage = new LoginPage();
        loginpage.open();
        loginpage.login("tomsmith","SuperSecretPassword!");

        Assert.assertEquals(
                loginpage.getCurrentUrl(),
                "https://the-internet.herokuapp.com/secure",
                "Login Failed leu leu!");

    }
}

package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameTxt = By.id("username");
    private By passwordTxt = By.id("password");
    private By loginBtn = By.xpath("//button[@type='submit']");

    public void open(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public boolean isLoggedIn(){
        return driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure");
    }

    public void login(String username, String password){
        find(usernameTxt).sendKeys(username);
        find(passwordTxt).sendKeys(password);
        find(loginBtn).click();
    }

}

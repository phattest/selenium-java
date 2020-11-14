package pages;

import org.openqa.selenium.By;

public class TodoPage extends BasePage{
    private By taskTxt = By.className("new-todo");
    private By allTab = By.xpath("//a[.='All']");
    private By activeTab = By.xpath("//a[.='Active']");

    public void open(){driver.get("http://todomvc.com/examples/vanillajs/");}

}

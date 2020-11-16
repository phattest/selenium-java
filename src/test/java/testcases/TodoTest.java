package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TodoPage;

public class TodoTest extends BaseTest{
    WebDriver driver;
    @Test
    void addTask(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://todomvc.com/examples/vanillajs/");
        TodoPage todopage = new TodoPage();
        todopage.open();
        int currentItemleft = getItemleft();

        //click All
        driver.findElement(By.className("new-todo")).sendKeys("task 1\n");
        driver.findElement(By.xpath("//a[.='All']")).click();
        WebElement task = driver.findElement(By.xpath("//label[.='task 1']"));
        Assert.assertTrue(task.isDisplayed());

        //Click Active
        driver.findElement(By.xpath("//a[.='Active']")).click();
        task = driver.findElement(By.xpath("//label[.='task 1']"));
        Assert.assertTrue(task.isDisplayed());

        //todo get item left
        String itemleft = driver.findElement(By.xpath("//span[@class='todo-count']")).getText();
        Assert.assertTrue(task.isDisplayed());
    }
    WebElement getTask(String byName){
        return driver.findElement(By.xpath(String.format("//label[.='%s']",byName)));
    }
    void selectTab(String name){
        driver.findElement(By.xpath(String.format("//a[.='%s']",name))).click();
    }
    int getItemleft(){
        int itemleft = 0;
        if (driver.findElement(By.xpath("//span[@class='todo-count']/strong")).isDisplayed()){
            itemleft = Integer.valueOf(driver.findElement(By.xpath("//span[@class='todo-count']/strong")).getText());
        }
        return itemleft;
    }
    void createNewTask(String byName){
        driver.findElement(By.className("new-todo")).sendKeys(byName+'\n');
    }
}
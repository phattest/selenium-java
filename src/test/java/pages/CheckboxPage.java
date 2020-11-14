package pages;

public class CheckboxPage extends BasePage{
    //private String checkbox1 = "//form[@id='checkboxes']/input[1]";
   // private String checkbox2 ="//form[@id='checkboxes']/input[2]" ;
    private String checkboxElement = "//form[@id='checkboxes']/input[]";
    //private WebDriver driver;

   /* public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }*/
    public void open(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    /*public WebElement getCheckbox(String checkboxName){
        return driver.findElement(By.xpath(String.format()));
    }*/

    public void checkOnCheckbox1() {

    }

}

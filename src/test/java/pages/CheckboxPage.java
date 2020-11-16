package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class CheckboxPage extends BasePage{
    //private String checkbox1 = "//form[@id='checkboxes']/input[1]";
   // private String checkbox2 ="//form[@id='checkboxes']/input[2]" ;
    private String checkboxElement = "//form[@id='checkboxes']//input[%s]";
    //private By checkboxElement = By.xpath("//form[@id='checkboxes']//input[%s]");

    @Override
    public void open(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public void checkOn(String checkboxName) {
        //check(getCheckbox(checkboxName));
        check(getCheckbox(checkboxName));

    }

    public WebElement getCheckbox(String checkBoxName){
        return find(How.XPATH, String.format(checkboxElement,checkBoxName));
        //return find(String.format(checkboxElement,checkBoxName));
    }



}

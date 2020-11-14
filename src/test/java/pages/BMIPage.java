package pages;

import Browsers.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMIPage extends BasePage{
    public BMIPage(){
        PageFactory.initElements(Browser.getDriver(),this);
    }

    // driver.findElement(By.xpath("//a[contains(.,'Metric Units')]"));
    @FindBy(xpath = "//a[.='Metric Units']")
    WebElement metricUnitTab;

    @FindBy(id="cage")
    WebElement ageTxt;

    @FindBy(id="csex1")
    WebElement maleRad;

    @FindBy(id="csex2")
    WebElement femaleRad;

    @FindBy(id="cheightmeter")
    WebElement heightTxt;

    @FindBy(id="ckg")
    WebElement weightTxt;

    @FindBy(xpath="//input[@value='Calculate']")
    WebElement calculatorBtn;

    @FindBy(className = "bigtext")
    WebElement result;

    public void open() {
        driver.get("https://www.calculator.net/bmi-calculator.html");
    }

    public void selectMetricTab(){
        metricUnitTab.click();
        //driver.findElement(By.xpath("//a[.='Metric Units']")).click();
    }

    public void fillForm(String age, String gender, String height, String weight){
        //driver.findElement(By.id("cage")).sendKeys("30");
        ageTxt.clear();
        ageTxt.sendKeys(age);
        if(gender.equalsIgnoreCase("male"))
            //driver.findElement(By.id("csex1")).click();
            maleRad.click();
        else
            //driver.findElement(By.id("csex2")).click();
            femaleRad.click();
        //driver.findElement(By.id("cheightmeter")).click();
        heightTxt.clear();
        heightTxt.sendKeys(height);
        //driver.findElement(By.id("ckg")).click();
        weightTxt.clear();
        weightTxt.sendKeys(weight);
        //driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
        calculatorBtn.click();
    }
    public String getResult(){
        return result.getText();
    }
}

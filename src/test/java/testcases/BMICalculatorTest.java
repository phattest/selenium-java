package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BMIPage;

public class BMICalculatorTest extends BaseTest{

    @Test(description = "")
    void validateData(){
        BMIPage bmipage =new BMIPage();
        bmipage.open();
        bmipage.selectMetricTab();
        bmipage.fillForm( "37", "male","178","68");
        Assert.assertEquals(bmipage.getResult(),"BMI = 21.5 kg/m2   (Normal)");
    }
}

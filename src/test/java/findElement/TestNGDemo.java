package findElement;

import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeSuite
    void BeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @Test
    void Tc01(){
        System.out.println("tc01");
    }

    @Test
    void Tc02(){
        System.out.println("tc02");
    }

}

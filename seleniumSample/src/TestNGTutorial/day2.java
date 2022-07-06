package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.*;

public class day2 {

    @Test
    public void method1(){
        System.out.println("I am in method1");
    }

    @BeforeTest
    public void method2(){
        System.out.println("I am before test method");
    }

    @Test(groups={"Smoke"})
    public void method3(){
        System.out.println("I am in smoke test2");
    }

    @BeforeSuite
    public void method4(){
        System.out.println("I am before suit method");
    }
}

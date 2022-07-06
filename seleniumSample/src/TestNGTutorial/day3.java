package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day3{

    @Test(dependsOnMethods = {"homeLoan"})
    public void personalLoan(){
        System.out.println("PersonalLoan");
    }

    @Test(enabled = false)
    public void carLoan(){
        System.out.println("CarLoan");
    }

    @Test(timeOut = 4000)
    public void homeLoan(){
        System.out.println("HomeLoan");
    }

    @AfterSuite
    public void TestLoan(){
        System.out.println("I am after suit method");
    }
}

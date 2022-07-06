package TestNGTutorial;

import org.testng.annotations.*;

public class day1 {

    @Parameters({"URL","Useranme"})
    @Test
    public void test1(String url,String Name)
    {
        System.out.println("Hello");
        System.out.println(url);
        System.out.println(Name);
    }

    @BeforeMethod
    public void Demo1()
    {
        System.out.println("I am before method");
    }

    @Test(groups={"Smoke"})
    public void Demo2()
    {
        System.out.println("I am smoke Test1");
    }

    @Test(dataProvider = "getData")
    public void Demo3(String username, String password)
    {
        System.out.println("Hello3");
        System.out.println(username);
        System.out.println(password);
    }

    @BeforeSuite
    public void Demo4()
    {
        System.out.println("I am before suit method");
    }

    @DataProvider
    public Object[][] getData(){

        Object [][] data= new Object[3][2];

        //1st dataset
        data[0][0] = "firstusername";
        data[0][1] = "firstPassword";

        //2nd dataset
        data[1][0] = "SecondUsername";
        data[1][1] = "Secomdpassword";

        //3rd dataset
        data[2][0] = "ThirdUsername";
        data[2][1] = "ThirdPassword";
        return data;
    }
}
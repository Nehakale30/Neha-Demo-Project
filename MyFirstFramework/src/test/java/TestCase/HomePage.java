package TestCase;

import Academy.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomePage extends base {
    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        log.debug("Url got initialized");
    }

    @Test
    public void homePageNavigation() {
        LandingPage lp = new LandingPage(driver);
        lp.getPopupClose().click();
        Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
        lp.getLogin().click();
        log.info("Text compared");

    }

    @Test(dataProvider = "getData", dependsOnMethods = "homePageNavigation")
    public void getlogin(String username, String password){
        LoginPage l = new LoginPage(driver);
        l.getEmail().sendKeys(username);
        l.getPassword().sendKeys(password);
        l.getSubmit().click();
        log.error("logged in successfully");
    }

    @AfterTest
    public void browserClose(){
        driver.close();
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "Neha@gmail.com";
        data[0][1] = "123456";
        data[1][0] = "abc@gmail.com";
        data[1][1] = "456789";

        return data;
    }

}

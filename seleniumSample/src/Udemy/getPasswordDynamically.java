package Udemy;

import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getPasswordDynamically {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("Neha");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.findElement(By.className("logout-btn")).click();
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.className("infoMsg")).getText();
        String[] passwordArray = passwordText.split("'");
        String[] passwordArray2 = passwordArray[1].split("'");
        String password = passwordArray2[0];
        return password;
    }
}


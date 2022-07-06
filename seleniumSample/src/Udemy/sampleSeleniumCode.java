package Udemy;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sampleSeleniumCode {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("Neha");
        driver.findElement(By.name("inputPassword")).sendKeys("test");
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        String Expectederror = driver.findElement(By.cssSelector("p.error")).getText();
        String Actualerror = "* Incorrect username or password";
        if(Expectederror .equals(Actualerror) )
            System.out.println("pass");
        else{
            System.out.println("false");
        }

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Neha");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Nehakale319@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("78454654544");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.findElement(By.className("logout-btn")).click();
        driver.close();
    }
}

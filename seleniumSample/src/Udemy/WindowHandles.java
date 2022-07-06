package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();
        String ParentId = it.next();
        String ChildId = it.next();

        driver.switchTo().window(ChildId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();
        driver.switchTo().window(ParentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}

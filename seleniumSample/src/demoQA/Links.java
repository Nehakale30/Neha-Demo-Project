package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class Links {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Links']")).click();
        driver.findElement(By.id("simpleLink")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it= window.iterator();
        String ParentID = it.next();
        String ChildID = it.next();
        driver.switchTo().window(ChildID);
        driver.close();
        driver.switchTo().window(ParentID);
        driver.findElement(By.id("dynamicLink")).click();
        driver.switchTo().window(ParentID);
        driver.close();
    }
}

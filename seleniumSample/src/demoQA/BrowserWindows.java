package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.id("tabButton")).click();
        Set<String> window1 = driver.getWindowHandles();
        Iterator<String> it1 = window1.iterator();
        String parentwindow1 = it1.next();
        String childwindow1 = it1.next();
        driver.switchTo().window(childwindow1);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(parentwindow1);
        driver.findElement(By.id("windowButton")).click();
        Set<String> window2 = driver.getWindowHandles();
        Iterator<String> it2 = window2.iterator();
        String parentwindow2 = it2.next();
        String childwindow2 = it2.next();
        driver.switchTo().window(childwindow2);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(parentwindow2);
        driver.findElement(By.id("messageWindowButton")).click();
        /*Set<String> window3 = driver.getWindowHandles();
        Iterator<String> it3 = window3.iterator();
        String parentwindow3 = it3.next();
        String childwindow3 = it3.next();
        driver.switchTo().window(childwindow3);
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Knowledge')]")).getText());
        driver.close();
        driver.switchTo().window(parentwindow3);*/
    }
}

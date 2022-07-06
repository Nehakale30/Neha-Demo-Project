package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Buttons']")).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().build().perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
        a.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
        driver.close();
    }
}

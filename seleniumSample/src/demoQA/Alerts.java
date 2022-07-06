package demoQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("confirmResult")).getText());
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("confirmResult")).getText());
        driver.findElement(By.id("promtButton")).click();
        driver.switchTo().alert().sendKeys("Neha");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("promptResult")).getText());

    }
}

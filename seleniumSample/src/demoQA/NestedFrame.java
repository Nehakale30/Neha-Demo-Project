package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")).getText());
        System.out.println(driver.findElement(By.xpath("//body/p")).getText());
        driver.close();
    }
}

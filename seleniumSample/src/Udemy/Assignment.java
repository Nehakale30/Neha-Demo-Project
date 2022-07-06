package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("Neha");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.xpath("//label[text()='Employed']/preceding::input[@value='option2']")).click();
        driver.findElement(By.name("bday")).sendKeys("30-12-1992");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
        driver.close();
    }
}

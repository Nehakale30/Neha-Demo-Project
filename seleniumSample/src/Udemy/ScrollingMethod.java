package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ScrollingMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTo(0,500)");

        List<WebElement> numbers = driver.findElements(By.xpath(" //div[@class='tableFixHead']//td[4]"));
        int sum =0;
        for(int i=0; i<numbers.size();i++ ){
           sum= sum + Integer.parseInt(numbers.get(i).getText()) ;
        }
        System.out.println(sum);

        int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum,total);
    }
}

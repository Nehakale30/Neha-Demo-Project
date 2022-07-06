package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class CountLinkOnPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement childFooter = footerdriver.findElement(By.xpath("//a[text()='Discount Coupons']//ancestor::ul"));
        System.out.println(childFooter.findElements(By.tagName("a")).size());
        for(int i=1; i<childFooter.findElements(By.tagName("a")).size(); i++){
            String click= Keys.chord(Keys.CONTROL,Keys.ENTER);
            childFooter.findElements(By.tagName("a")).get(i).sendKeys(click);
        }
        Set<String> test = driver.getWindowHandles();
        Iterator <String> s = test.iterator();
        while (s.hasNext()){
            driver.switchTo().window(s.next());
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getPageSource());
        }

    }
}

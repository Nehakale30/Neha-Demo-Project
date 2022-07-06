package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class AutoSuggestiveDropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option:options)
          {
            if(option.getText().equalsIgnoreCase("India"))
            {
            option.click();
            break;
            }
          }
        driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
        System.out.println(driver.findElements(By.name("ctl00$mainContent$rbtnl_Trip")).size());
        }
    }


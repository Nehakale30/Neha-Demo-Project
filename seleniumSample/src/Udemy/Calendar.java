package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.findElement(By.id("travel_date")).click();
        while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("December"))
        {
            driver.findElement(By.cssSelector(".datepicker-days .next")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("day"));
        int Count = driver.findElements(By.className("day")).size();
        for (int i=0; i<Count;i++){
            String text= driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("30")){
                driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
                break;
            }
        }
    }
}

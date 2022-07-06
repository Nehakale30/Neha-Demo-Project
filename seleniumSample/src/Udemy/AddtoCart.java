package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class AddtoCart {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();
            String[] itemNames = {"Brocolli", "Cucumber", "Carrot"};
            int j=0;
            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
            for (int i=0; i< products.size();i++){
                String[] name= products.get(i).getText().split(" ");
                String formattedstring = name[0].trim();
                List al = Arrays.asList(itemNames);
                if(al.contains(formattedstring)){
                    j++;
                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                    if(j==itemNames.length){
                        break;
                    }
                }
            }
            driver.findElement(By.cssSelector("img[alt=Cart]")).click();
            driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
            driver.findElement(By.className("promoBtn")).click();
            driver.findElement(By.xpath("//button[text()='Place Order']")).click();
            WebElement StaticDropDown= driver.findElement(By.xpath("//option[text()='Select']/parent::select"));
            Select dropdown = new Select(StaticDropDown);
            Thread.sleep(2000);
            dropdown.selectByVisibleText("India");
            driver.findElement(By.className("chkAgree")).click();
            driver.findElement(By.xpath("//button[text()='Proceed']")).click();
            Thread.sleep(3000);
            System.out.println(driver.findElement(By.xpath("//*[contains(text(),'successfully')]")).getText());
        }
}

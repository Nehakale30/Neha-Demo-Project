package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ImplicitAndExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicitwait

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        int j=0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i=0; i< products.size();i++){
            String[] name= products.get(i).getText().split(" ");
            String formattedstring = name[0].trim();
            List al = Arrays.asList(itemsNeeded);
            if(al.contains(formattedstring)){
                j++;
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                if(j==itemsNeeded.length){
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        WebDriverWait wait = new WebDriverWait(driver,30);   //Explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));

        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());





    }
}

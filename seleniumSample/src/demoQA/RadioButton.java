package demoQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public record RadioButton() {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".btn.btn-light.active")).click();
        driver.findElement(By.xpath("//label[text()='Yes']")).click();
        System.out.println(driver.findElement(By.className("mt-3")).getText());
        driver.findElement(By.xpath("//label[text()='Impressive']")).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),Impressive)]")).getText());
        System.out.println(driver.findElement(By.id("noRadio")).isEnabled());
    }
}

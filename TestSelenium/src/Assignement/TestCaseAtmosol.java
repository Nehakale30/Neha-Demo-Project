package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCaseAtmosol {
    public static void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");

    }

    public static void openUrl(WebDriver driver){
        driver.get("http://tutorialsninja.com/demo/");
        System.out.println(driver.getTitle());

    }

    public static void navigateToSubMenu(WebDriver driver){
        driver.findElement(By.xpath("//a[text()='Components']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
    }

    public static void navigateToMyAccountTab(WebDriver driver){
        driver.findElement(By.linkText("My Account")).click();
    }

    public static void navigateToRegisterButton(WebDriver driver){
        driver.findElement(By.linkText("Register")).click();
    }

    public static void getRegistered(WebDriver driver){
        driver.findElement(By.id("input-firstname")).sendKeys("Neha");
        driver.findElement(By.id("input-lastname")).sendKeys("Kale");
        driver.findElement(By.id("input-email")).sendKeys("fgfgdfgdfg@gmgdggail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("123456789");
        driver.findElement(By.id("input-password")).sendKeys("Test");
        driver.findElement(By.id("input-confirm")).sendKeys("Test");
        driver.findElement(By.className("btn-primary")).click();
        System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
        driver.findElement(By.cssSelector("input[name='agree']")).click();
        driver.findElement(By.className("btn-primary")).click();
    }

    public static void validateSuccessMessage(WebDriver driver){
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getText());
        driver.findElement(By.className("btn-primary")).click();
        System.out.println(driver.getTitle());
    }

    public static void validateChangePasswordPage(WebDriver driver){
        driver.findElement(By.xpath("//a[text()='Change your password']")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("input-password")).sendKeys("Atmosol");
        driver.findElement(By.id("input-confirm")).sendKeys("Atmosol");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    public static void validatePasswordChangeSuccessMessage(WebDriver driver){
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
    }

    public static void navigateToLogoutButton(WebDriver driver){
        driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
    }

    public static void closeBrowser(WebDriver driver){
        driver.close();
    }


    public static void main(String[] args) {
        invokeBrowser();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openUrl(driver);
        navigateToSubMenu(driver);
        navigateToMyAccountTab(driver);
        navigateToRegisterButton(driver);
        getRegistered(driver);
        validateSuccessMessage(driver);
        validateChangePasswordPage(driver);
        validatePasswordChangeSuccessMessage(driver);
        navigateToMyAccountTab(driver);
        navigateToLogoutButton(driver);
        closeBrowser(driver);

    }

}

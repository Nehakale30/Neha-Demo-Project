package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHTTPSCertification {

    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://expired.badssl.com/");

    }
}

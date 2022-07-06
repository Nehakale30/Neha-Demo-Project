package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signIn = By.cssSelector("a[href*='sign_in']");
    By closePopup = By.xpath("//button[text()='NO THANKS']");
    By title = By.xpath("//h2[text()='Featured Courses']");


    public LandingPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getLogin(){
        return driver.findElement(signIn);
    }

    public WebElement getPopupClose(){
        return driver.findElement(closePopup);
    }

    public WebElement getTitle(){
        return driver.findElement(title);
    }
}

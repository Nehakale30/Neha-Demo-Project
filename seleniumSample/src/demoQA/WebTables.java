package demoQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
        String FirstName = driver.findElement(By.xpath("//div[text()='First Name']/following::div[@class='rt-tr-group'][1]/div/div[1]")).getText();
        System.out.println("First Name = " + FirstName);
        String LastName = driver.findElement(By.xpath("//div[text()='Last Name']/following::div[@class='rt-tr-group'][1]/div/div[2]")).getText();
        System.out.println("Last Name = " + LastName);
        String Age = driver.findElement(By.xpath("//div[text()='Age']/following::div[@class='rt-tr-group'][1]/div/div[3]")).getText();
        System.out.println("Age = "+ Age);
        String Email = driver.findElement(By.xpath("//div[text()='Email']/following::div[@class='rt-tr-group'][1]/div/div[4]")).getText();
        System.out.println("Email Id = " + Email);
        String Salary = driver.findElement(By.xpath("//div[text()='Salary']/following::div[@class='rt-tr-group'][1]/div/div[5]")).getText();
        System.out.println("Salary = " + Salary);
        String Department = driver.findElement(By.xpath("//div[text()='Department']/following::div[@class='rt-tr-group'][1]/div/div[6]")).getText();
        System.out.println("Department = " + Department);
    }
}

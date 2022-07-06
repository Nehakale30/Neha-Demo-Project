package Academy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class base {
    public WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\nkale\\eclipse-workspace\\MyFirstFramework\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);
        String BrowserName = prop.getProperty("browser");

        if(BrowserName .equals( "chrome") ){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkale\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(BrowserName.equals( "firefox")){

        }
        else if(BrowserName.equals("IE")){

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }

    public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationPath = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationPath));
    }
}


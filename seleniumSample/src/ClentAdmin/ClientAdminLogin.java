package ClentAdmin;
import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class ClientAdminLogin {

    static void browserInvoke(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nkale\\Documents\\chromedriver.exe");
    }

    static void openurl(WebDriver driver){
        driver.get("https://clientadmin.stage.entratadev.com/?module=authentication-new&action=post_logout");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='click here']")).click();
    }

    static void login(WebDriver driver){
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$UsernameTextBox")).sendKeys("nkale");
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$PasswordTextBox")).sendKeys("Entrata123");
        driver.findElement(By.id("signin-submit")).click();
    }

    static void clickOnMyEntrata(WebDriver driver){
        driver.findElement(By.xpath("//li[@id='my_xento']")).click();
    }

    static void validateProgressReportButton(WebDriver driver){
        System.out.println(driver.findElement(By.xpath("//a[text()='Progress Reports']")).isDisplayed());
    }

    static void validateMyReviewTableHeading(WebDriver driver){
        List<WebElement> tableheading = driver.findElements(By.xpath("//tr[@class='valign-header']/th"));
        for(WebElement i:tableheading){
            String test= i.getText();
            System.out.println(test);
            System.out.println(i.isDisplayed());
        }
    }

    static void employeeToBeReviewedTableHeading(WebDriver driver){
        List<WebElement> employeetableheading = driver.findElements(By.xpath("//tr[@class='valign-header']/th"));
        System.out.println(employeetableheading.size());
        for(WebElement j:employeetableheading){
           // String test1= j.getText();
           // System.out.println(test1);
            System.out.println(j.isDisplayed());
        }
    }

     static void clickOnEmployeeRoBeReviewedButton(WebDriver driver){
        driver.findElement(By.id("employees_to_be_reviewed")).click();
    }

     static void clickonTestSurveys(WebDriver driver){
        driver.findElement(By.id("tests_tab")).click();
    }

    static void validateTestSurveyTableHeading(WebDriver driver){
       List<WebElement> testtableheading = driver.findElements(By.xpath("//table[@class='sort']/tbody/tr/th"));
       for(WebElement k:testtableheading){
           String test3 = k.getText();
           System.out.println(test3);
           System.out.println(k.isDisplayed());
       }
    }

    static void clickonTimeOffRequestTab(WebDriver driver){
        driver.findElement(By.id("time_off_requests")).click();
    }

    static void validateAddRequestButton(WebDriver driver){
        System.out.println(driver.findElement(By.xpath("//a[text()=' Add Request']")).isDisplayed());
    }

    static void validateTimeOddDetailTable(WebDriver driver){
        List<WebElement> TimeDetails = driver.findElements(By.xpath("(//div[@class='body'])[2]//dl"));
        for(WebElement l: TimeDetails) {
           String test4 = l.getText();
           System.out.println(test4);
           System.out.println(l.isDisplayed());
        }

    }

    static void validateCategoryTable(WebDriver driver) {
        List<WebElement> CategoryDetails = driver.findElements(By.xpath("(//div[@class='body'])[3]//dl"));
        for (WebElement m : CategoryDetails) {
            String test4 = m.getText();
            System.out.println(test4);
            System.out.println(m.isDisplayed());
        }
    }

    static void clickOnWeekendWoringRequestTab(WebDriver driver){
        driver.findElement(By.id("view_weekend_working_requests")).click();
    }

    static  void clickOnWorkFromHomeRequestTab(WebDriver driver){
        driver.findElement(By.id("view_work_from_home_requests")).click();
    }

    static  void clickOnReleaseSupportRequestTab(WebDriver driver) {
        driver.findElement(By.id("view_release_support_requests")).click();
    }

    static  void clickOnWorkFromOfficeRequestTab(WebDriver driver) {
        driver.findElement(By.id("view_work_from_office_requests")).click();
    }

    static  void clickOnClubTab(WebDriver driver) {
        driver.findElement(By.id("club_tab")).click();
    }

    static  void ValidateBirthdayTable(WebDriver driver) {
        System.out.println(driver.findElement(By.cssSelector("b[id=birthdays_and_anniversary]")).isDisplayed());
    }

    static  void ValidateHolidayTable(WebDriver driver) {
       List<WebElement> HolidayTable =  driver.findElements(By.cssSelector("table[class='sort binded'] tr"));
        for (WebElement n : HolidayTable) {
            String test5 = n.getText();
            System.out.println(test5);
            System.out.println(n.isDisplayed());
        }
    }

    static void validateQuickLinks(WebDriver driver ) {
      List<WebElement> QuickLinks = driver.findElements(By.cssSelector("ul[class='lineheight-30 margin10-left'] li"));
        for (WebElement o : QuickLinks) {
            String test6 = o.getText();
            System.out.println(test6);
            System.out.println(o.isDisplayed());
        }
    }

    static  void clickOnValueNominationTab(WebDriver driver) {
        driver.findElement(By.id("values_nomination")).click();
    }

    static  void validateValueNomination(WebDriver driver) {
        System.out.println(driver.findElement(By.cssSelector(".clean.noborder")).isDisplayed());
    }

    static  void clickOnTransportationEnrollmentTab(WebDriver driver) {
        driver.findElement(By.id("view_transportation_enrollments")).click();
    }


        public static void main(String[] args) throws InterruptedException {
        browserInvoke();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        openurl(driver);
        login(driver);
        clickOnMyEntrata(driver);
        validateProgressReportButton(driver);
        validateMyReviewTableHeading(driver);
        clickOnEmployeeRoBeReviewedButton(driver);
        validateProgressReportButton(driver);
        employeeToBeReviewedTableHeading(driver);
        clickonTestSurveys(driver);
        validateTestSurveyTableHeading(driver);
        clickonTimeOffRequestTab(driver);
        validateAddRequestButton(driver);
        validateTimeOddDetailTable(driver);
        validateCategoryTable(driver);
        clickOnWeekendWoringRequestTab(driver);
        validateAddRequestButton(driver);
        clickOnWorkFromHomeRequestTab(driver);
        validateAddRequestButton(driver);
        clickOnReleaseSupportRequestTab(driver);
        validateAddRequestButton(driver);
        clickOnWorkFromOfficeRequestTab(driver);
        validateAddRequestButton(driver);
        clickOnClubTab(driver);
        Thread.sleep(5000);
        ValidateBirthdayTable(driver);
        ValidateHolidayTable(driver);
        validateQuickLinks(driver);
        clickOnValueNominationTab(driver);
        validateValueNomination(driver);
        clickOnTransportationEnrollmentTab(driver);
        validateAddRequestButton(driver);
    }
}

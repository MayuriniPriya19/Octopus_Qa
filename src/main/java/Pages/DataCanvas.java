package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DataCanvas {
    private WebDriver driver;
    private SoftAssert sa;
    public DataCanvas(WebDriver driver) {
        this.driver = driver;
		
		 // Maximize the browser window
	    driver.manage().window().maximize();
        sa = new SoftAssert();
    }
    public void verifyTitle() {
        sa.assertEquals(driver.getTitle(), "OctopusBI - Log in - OctopusBI");
    }
    
    public void verifyWelcomeMessage() {
        //  wait
        WebDriverWait wait = new WebDriverWait(driver, 15); // 10 seconds timeout
        WebElement welcomeMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ant-col ant-col-17']/h3")));
        System.out.print("Web Element");
        // soft assert
        sa.assertEquals(welcomeMessage.getText(), "Welcome to Octopus BI");
        System.out.print("Web Element Success!");
    }
     
    public void assertAll() {
        sa.assertAll();
    }
    
    
}

package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.DataCanvas;
import Pages.QaLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
    WebDriver driver;
    QaLogin loginPage;
    DataCanvas homePage;
    
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new QaLogin(driver);
        homePage = new DataCanvas(driver);
    }
    @Test
    public void loginTest() {
        driver.get("https://qa.bi-octopus.com/login");
        loginPage.login("mayurini.priya@octopusbi.com", "Sweet@19A");
        homePage.verifyTitle();
        homePage.verifyWelcomeMessage();
        homePage.assertAll();
    }
    

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

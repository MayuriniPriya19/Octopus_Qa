package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.DataCanvas;
import Pages.DynamicText;
import Pages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDynamic {
	
	private WebDriver driver;
	private Login loginPage;
	DataCanvas homePage;
	private DynamicText dynamicPage;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co);
	
		loginPage = new Login(driver);
		homePage = new DataCanvas(driver);
		dynamicPage = new DynamicText(driver);
	}
	
	@Test
	public void HomePageNavigation() {
		driver.get("https://qa.bi-octopus.com/");
		driver.manage().window().maximize();
		loginPage.login("mayurini.priya@octopusbi.com", "Sweet@19A");
		dynamicPage.NavigateToDynamicText();
	}

}

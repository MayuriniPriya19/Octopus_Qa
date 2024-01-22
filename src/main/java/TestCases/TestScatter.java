package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.DataCanvas;
import Pages.Login;
import Pages.ScatterChart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScatter {
	
	private WebDriver driver;
	private Login loginPage;
	DataCanvas homePage;
	private ScatterChart scatterPage;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co);
	
		loginPage = new Login(driver);
		homePage = new DataCanvas(driver);
		scatterPage = new ScatterChart(driver);
	}
	
	@Test
	public void HomePageNavigation() {
		driver.get("https://qa.bi-octopus.com/");
		driver.manage().window().maximize();
		loginPage.login("mayurini.priya@octopusbi.com", "Sweet@19A");
		scatterPage.NavigateToScatterChart();
	}

}

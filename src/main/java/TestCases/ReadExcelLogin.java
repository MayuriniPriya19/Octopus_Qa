package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.AreaChart;
//import Pages.Dashboard;
import Pages.DataCanvas;
import Pages.HomePage;
import Pages.Login;
import Utility.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelLogin {
	
	WebDriver driver;
    Login loginPage;
    DataCanvas homePage;
    
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions op = new ChromeOptions();
        op.setHeadless(false);
        driver = new ChromeDriver(op);
        
        
        String filePath = "C:\\Users\\Mayurini Priya\\eclipse-workspace\\Octopus_Qa\\Data\\LoginSheet.xlsx";
        String sheetName = "Sheet1";
        String url = ReadExcel.readExcelValue(1, 0, filePath, sheetName);
        String username = ReadExcel.readExcelValue(1, 1, filePath, sheetName);
        String password = ReadExcel.readExcelValue(1, 2, filePath, sheetName);
        
        driver.get(url);
        
        loginPage = new Login(driver);
        homePage = new DataCanvas(driver);
        
        loginPage.login(username, password);      
    }
    
    @Test
    public static void loginTest() {
    	SoftAssert sa = new SoftAssert();
        //sa.assertEquals(Dashboard.getDashboardText(), "Welcome to Octopus BI");
        sa.assertAll();
    }    
}

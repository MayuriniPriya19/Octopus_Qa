package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.WaitforElement;

public class Dashboard {
	
	private WebDriver driver;
	
	public Dashboard (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDashboardText () {
		By dashboardLink = By.xpath("//a[@href='/dashboard']");
		WaitforElement.waitforElementPresent(dashboardLink, driver);
	}

}

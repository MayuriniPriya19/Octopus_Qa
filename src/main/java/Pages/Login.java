package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
private WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		WebElement usernameField = driver.findElement(By.id("login_email"));
		usernameField.sendKeys(username);
		
		driver.findElement(By.xpath("//form[@class='ant-form ant-form-horizontal']/button")).submit();

		WebElement passwordField = driver.findElement(By.id("addPassword_password"));
		passwordField.sendKeys(password);
		
		driver.findElement(By.xpath("//form[@class='ant-form ant-form-horizontal']/button")).click();
		
	}

}

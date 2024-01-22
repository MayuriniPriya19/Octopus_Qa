package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QaLogin {
private WebDriver driver;
	
	public QaLogin (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String useremail, String password) {
		
		WebElement EmailAddressField = driver.findElement(By.id("login_email"));
		EmailAddressField.sendKeys(useremail);
		
		driver.findElement(By.xpath("//form[@class='ant-form ant-form-horizontal']/button")).click();
		
		WebElement passwordField = driver.findElement(By.id("addPassword_password"));
		passwordField.sendKeys(password);
		
		driver.findElement(By.xpath("//form[@class='ant-form ant-form-horizontal']/button")).click();	
	}

}

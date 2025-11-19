package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void open() {
		driver.get("http://localhost:8000/");
		
	}
	
	public void enterEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(By.id("loginBtn")).click();
	}
	
	public String getErrorMessage()  {
		return driver.findElement(By.id("error3")).getText();
	}
	
	public String getLoggedInInfo()  {
		return driver.findElement(By.id("logoutBtn")).getText();
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	private WebDriver driver;
	
	public  LogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void open() {
		driver.get("http://localhost:8000/dashboard");
	}
	
	public void clickLogout() {
		driver.findElement(By.id("logoutBtn")).click();
	}
	public String isCorrectURL() {
		return driver.getCurrentUrl();
	}
}

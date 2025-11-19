package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LogoutPage;

public class LogoutTest {

	WebDriver driver;
	LogoutPage logout;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		logout=new LogoutPage(driver);
	}
	
	@Test
	public void logoutFn() {
		logout.open();
		logout.clickLogout();
		
		Assert.assertEquals(logout.isCorrectURL(),"http://localhost:8000/logout");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.LoginPage;

public class LoginTest  {
	WebDriver driver;
 	LoginPage login;
	
	

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		login = new LoginPage(driver);
	}

	@Test
	public void validLoginTest()  {
		
		login.open();
		login.enterEmail("admin000@gmail.com");
		login.enterPassword("admin000");
		login.clickLogin();
		
		Assert.assertEquals(login.getLoggedInInfo(), "Logout");
	}
	
	@Test
	public void invalidLoginTest() {
		
		login.open();
		login.enterEmail("arjun222@gmail.com");
		login.enterPassword("user123");
		login.clickLogin();
		login.getErrorMessage();
		
		Assert.assertTrue(login.getErrorMessage().contains("Invalid"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

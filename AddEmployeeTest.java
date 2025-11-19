package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddEmployeePage;

public class AddEmployeeTest {
	WebDriver driver;
	AddEmployeePage addEmp;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		addEmp=new AddEmployeePage(driver);
	}
	
	@Test
	public void validAddEmpTest() {
		addEmp.open();
		addEmp.enterId("emp002");
		addEmp.enterName("George");
		addEmp.enterEmailid("george123@gmail.com");
		addEmp.enterDept("HR");
		addEmp.enterScore("79");
		addEmp.clickAdd();
		
		Assert.assertTrue(addEmp.isEmployeeInList("George"));
	}
	
	@Test
	public void invalidId() {
		addEmp.open();
		addEmp.enterName("Mary");
		addEmp.enterEmailid("mary123@gmail.com");
		addEmp.enterDept("Sales");
		addEmp.enterScore("34");
		addEmp.clickAdd();
		
		Assert.assertTrue(addEmp.errorMsg1().contains("required"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

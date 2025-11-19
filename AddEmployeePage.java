package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {

	private WebDriver driver;
	
	public AddEmployeePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void open() {
		driver.get("http://localhost:8000/addEmployee");
	}
	
	public void enterId(String id) {
		driver.findElement(By.id("empId")).sendKeys(id);
	}
	
	public void enterName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);

		}
	public void enterEmailid(String email) {
		driver.findElement(By.id("email")).sendKeys(email);

	}
	public void enterDept(String dept) {
		driver.findElement(By.id("dept")).sendKeys(dept);

	}
	public void enterScore(String score) {
		driver.findElement(By.id("score")).sendKeys(score);

	}
	
	public void clickAdd() {
		driver.findElement(By.id("empBtn")).click();
	}
	
	public boolean isEmployeeInList(String name) {
		return driver.findElements(By.xpath("//li[contains(.,'" + name + "')]")).size() > 0;	}
	
	public String errorMsg1() {
		return driver.findElement(By.id("error1")).getText();
	}
	 
}

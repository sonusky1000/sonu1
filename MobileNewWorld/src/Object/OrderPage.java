package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	WebDriver driver;
	public OrderPage(WebDriver driver) {
		this.driver=driver;
	}
	By FirstName=By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[1]/input");
	By LastName=By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input");
	By Email=By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[2]/input");
	By Password=By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div[2]/input");
	By Mobile=By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[4]/input");
	By Address1=By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div[1]/input");
	By Address2=By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div[2]/input");
	By City=By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/input");
	By Zip=By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[3]/input");
	By Count=By.xpath("/html/body/div[1]/div/div[2]/form/div[6]/div[2]/input");
	

	public WebElement getFirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement getLastName() {
		return driver.findElement(LastName);
	}
	public WebElement getEmail() {
		return driver.findElement(Email);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getMobile() {
		return driver.findElement(Mobile);
	}
	public WebElement getAddress1() {
		return driver.findElement(Address1);
	}
	public WebElement getAddress2() {
		return driver.findElement(Address2);
	}
	public WebElement getCity() {
		return driver.findElement(City);
	}
	public WebElement getZip() {
		return driver.findElement(Zip);
	}
	public WebElement getCount() {
		return driver.findElement(Count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


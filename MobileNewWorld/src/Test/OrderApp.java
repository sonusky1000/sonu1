package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Object.OrderPage;

public class OrderApp {
	@Test(dataProvider="get")
	public void oarderApp(String fname,String lname, String email, String pass, String mobile, String add1, String add2, String city,String zip,String count) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"samsung\"]/div[1]/div/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]/a")).click();
   
    Set <String> currentHandle=driver.getWindowHandles();
    Iterator<String>it =currentHandle.iterator();
    String parentId=it.next();
    String childId=it.next();
    driver.switchTo().window(childId);
    
    
    OrderPage od=new OrderPage(driver);
    od.getFirstName().sendKeys(fname);
    od.getLastName().sendKeys(lname);
    od.getEmail().sendKeys(email);
    od.getPassword().sendKeys(pass);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[3]/input")).click();
    od.getMobile().sendKeys(mobile);
    od.getAddress1().sendKeys(add1);
    od.getAddress2().sendKeys(add2);
    od.getCity().sendKeys(city);
   
    
    WebElement st=driver.findElement(By.id("inputState"));
    Select sel=new Select(st);
    sel.selectByIndex(0);
    
    od.getZip().sendKeys(zip);
    driver.findElement(By.xpath("//*[@id=\"myForm\"]/fieldset/div/div[1]/div/div[2]/label/input")).click();
    driver.findElement(By.xpath("//*[@id=\"myForm\"]/fieldset/div/div[1]/div/div[2]/label/input")).click();
    driver.findElement(By.xpath("//*[@id=\"Samsung\"]")).click();
    
    od.getCount().sendKeys(count);
    
    driver.findElement(By.xpath("//*[@id=\"bought\"]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[8]/div[2]/input")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[9]/div[2]/input")).click();
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[10]/button"));
     
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[10]/button")).click();
    
}
  
    @DataProvider(name="get")
    public Object getData() {
    	Object[][] Data=new Object[2][10];
    	Data[0][0]= "Sonu";
    	Data[0][1]= "kumar";
    	Data[0][2]= "Sk100@gmail.com";
    	Data[0][3]= "Sk@123";
    	Data[0][4]= "9090999909";
    	Data[0][5]= "Sector b b796 dch sgrl mp";
    	Data[0][6]= "Manyata tech park,abc block,Bangalore";
    	Data[0][7]= "Bangalore";
    	Data[0][8]= "486888";
    	Data[0][9]= "3";
    	
    	
    	
    	
    	Data[1][0]= "Sk";
    	Data[1][1]= "9";
    	Data[1][2]= "Sk100@gmail.com";
    	Data[1][3]= "Sk@123";
    	Data[1][4]= "909099";
    	Data[1][5]= "Sector56 jynt sgrl mp";
    	Data[1][6]= "Manyata tech park,abc block,Bangalore";
    	Data[1][7]= "BA";
    	Data[1][8]= "408089gh40";
    	Data[1][9]= "45th";
    	return Data;
    
}
}


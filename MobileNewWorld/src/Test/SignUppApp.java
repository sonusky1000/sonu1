package Test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Object.SignUpPage;

public class SignUppApp {
	@Test(dataProvider="get")
	public void SignUpApp(String first, String last, String email,String pass, String num, String bio) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonu.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/p/a")).click();
		
		SignUpPage sup=new SignUpPage(driver);
		sup.getFirstName().sendKeys(first);
		sup.getLastName().sendKeys(last);
		sup.getEmail().sendKeys(email);
		sup.getPass().sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[2]/input")).sendKeys("10-06-2000");
		
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		sup.getNum().sendKeys(num);
		sup.getBio().sendKeys(bio);
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/button")).click();
		Alert ar =driver.switchTo().alert();
		String res=ar.getText();
		//Assert.assertEquals(res,"Hai,"+first+"! Go To SignIn");
		ar.accept();
	}
	@DataProvider(name="get")
	public Object[][]getData(){
		Object[][] Data=new Object[3][6];
		Data[0][0]="Sonu";
		Data[0][1]="Kumar";
		Data[0][2]="abc123@gmail.com";
		Data[0][3]="kumar@123";
		Data[0][4]="9890987722";
		Data[0][5]="I am Kumar";
		
		Data[1][0]="Kumar120";
		Data[1][1]="";
		Data[1][2]="Sk123";
		Data[1][3]="kumar@230";
		Data[1][4]="000000112";
		Data[1][5]="MY NAME IS SONU";
		
		Data[2][0]="";
		Data[2][1]="Kumar098";
		Data[2][2]="Stokes100@gmail.com";
		Data[2][3]="Sachin@333";
		Data[2][4]="9090909090";
		Data[2][5]="My Name is SONU";
		
		return Data;
	}
	}



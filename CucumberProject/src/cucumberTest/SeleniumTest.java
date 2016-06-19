package cucumberTest;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	private static WebDriver driver;
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		
		driver.get("http://demo.mahara.org/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("login_login_username")).click();
		driver.findElement(By.id("login_login_username")).sendKeys("student1"); 
		driver.findElement(By.id("login_login_password")).sendKeys("Testing1");
		driver.findElement(By.id("login_submit")).click();
		System.out.println("line after login is "+driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/h1")).getText());
		AssertJUnit.assertEquals("Welcome to the Mahara Demo Site", driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/h1")).getText());
		//AssertJUnit.assertEquals(message, expected, actual);
		System.out.println("line after..............");
	}
	
	
	
	
}

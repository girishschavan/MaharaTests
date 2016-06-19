package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testSteps {
	private static WebDriver driver;
	
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://demo.mahara.org/");
		driver.manage().window().maximize();
		System.out.println("browser opened123456");
		// Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
	}

	@When("^I enter username and passowrd$")
	public void i_enter_username_and_passowrd() throws Throwable {
		driver.findElement(By.id("login_login_username")).sendKeys("student1"); 
		driver.findElement(By.id("login_login_password")).sendKeys("Testing1");
		driver.findElement(By.id("login_submit")).click();
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I see wecome message$")
	public void i_see_wecome_message() throws Throwable {
		System.out.println("line after login is "+driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/h1")).getText());
		AssertJUnit.assertEquals("Welcome to the Mahara Demo Site", driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/h1")).getText());
		//AssertJUnit.assertEquals(message, expected, actual);
		System.out.println("line after..............");
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
	    
		driver.findElement(By.id("login_login_username")).sendKeys(arg1); 
		driver.findElement(By.id("login_login_password")).sendKeys(arg2);
		driver.findElement(By.id("login_submit")).click();
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}

package Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenarioSteps {
	
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("Inhome page");
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@When("^User enters ([^\"]*) and ([^\"]*)$")
	public void user_enters_UserName_and_Password(String user,String pwd) throws Throwable {
	 
	  driver.findElement(By.id("log")).sendKeys(user); 	 
	  driver.findElement(By.id("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("login")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
		driver.quit();
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		  System.out.println("LogOut Successfully");
		  
	}
	
	
	@Before
	public void setup(){
		System.out.println("Before class");
	}
	
	
	@After
	public void teardown(){
		System.out.println("After class");
	//	driver.close();
	}
	

}

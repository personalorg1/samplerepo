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

public class testSteps {
	
	public static WebDriver driver;
	/*@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("log")).sendKeys("testuser_1"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
	}
	
	@When("^User enters \"(.*?)\" and Password$")
	public void user_enters_and_Password(String username) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(username); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password(DataTable arg1) throws Throwable {
	  List<List<String>> data = arg1.raw();
	  System.out.println(data);
	  driver.findElement(By.id("log")).sendKeys(data.get(1).get(1)); 	 
	  driver.findElement(By.id("pwd")).sendKeys(data.get(2).get(1));
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
		  
	}*/
	
	
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

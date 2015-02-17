package CucumbetTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
	//	System.setProperty("webdriver.chrome.driver","D:\\Users\\dbhovi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	//	driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");

	}

}

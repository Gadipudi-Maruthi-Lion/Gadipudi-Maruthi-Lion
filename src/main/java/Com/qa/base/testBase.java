package Com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testBase {
	
	public static WebDriver driver;
	
	public String url = "http://www.flipkart.com";
	public static String loginid = "7416640366";
	public static String password = "7416640366";
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Maruthi Work\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
		
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
	

}

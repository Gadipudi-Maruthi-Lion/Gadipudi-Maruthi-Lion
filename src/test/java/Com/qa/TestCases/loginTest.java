
package Com.qa.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import Com.qa.base.testBase;
import Com.qa.pages.loginPage;

public class loginTest extends testBase{
	@Test
	public void loginToFlipkart() throws InterruptedException, IOException {
		loginPage login = new loginPage();
		Thread.sleep(2000);
		
		//File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //1st line important

		//FileUtils.copyFile(f, new File("D:\\fb.jpeg")); //+date should add-----------//2nd line important
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(" "+list.size());
		
		login.login(driver);


	}
	
	
	
	@Test
	public void screenshot()
	{
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //1st line important

		try {
			FileUtils.copyFile(f, new File("D:\\fb.jpeg"));
		} catch (Exception e) {
			System.out.println("file not founded "+e.getMessage());
			
		}
		
		
	}
	
}

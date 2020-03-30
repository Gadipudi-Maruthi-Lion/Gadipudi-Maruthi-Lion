package Com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.qa.base.testBase;

public class loginPage extends testBase{
	
	By loginidTB = By.className("_2zrpKA");
	By pswd = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginBTN = By.xpath("(//button[@type='submit'])[2]");
	
	public void login(WebDriver driver) {
		driver.findElement(loginidTB).sendKeys(testBase.loginid);
		driver.findElement(pswd).sendKeys(testBase.password);
		driver.findElement(loginBTN).click();

		
	}
	
	

}

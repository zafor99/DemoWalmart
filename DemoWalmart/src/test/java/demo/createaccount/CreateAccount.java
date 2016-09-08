package demo.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import practice.DemoProject.framework.Scriptbase;
import practice.DemoProject.framework.Utility;

public class CreateAccount extends Scriptbase{

	
	//WebDriver driver = new FirefoxDriver();
	@Test
	public void createValidAccount(){
		
		test.log(LogStatus.INFO, "Browser started ");
		walmart().homepage().clicksignIn();
		String title = driver.getTitle();
		System.out.println(title);
		try {
			Assert.assertEquals(title,"Google");
			test.log(LogStatus.PASS, "Title verified");
		} catch (AssertionError e) {
			String screenshot_path=Utility.captureScreenShot(driver, "test");
			String image= test.addScreenCapture(screenshot_path);
			test.log(LogStatus.FAIL, "Title verification", image);
			//test.log(LogStatus.FAIL, "Title verify Failed");
			
		}
			

		
	}
	
/*	public void createAccountNoBillingAddress(){
		driver.get("https://www.walmart.com");
		driver.manage().window().maximize();
		
		WebElement signInButton = driver.findElement(By.xpath("//button[@data-automation-id ='button']"));
		signInButton.click();
		
		
		driver.close();
		driver.quit();
	}*/
}

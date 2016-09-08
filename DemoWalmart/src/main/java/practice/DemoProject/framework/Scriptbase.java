package practice.DemoProject.framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Scriptbase {

	public static ExtentReports extent;
	public static ExtentTest test = null;
	
	private ApplicationController walmart = null;
	public static WebDriver driver  = null;
	private  String url = "http://www.walmart.com";
	public ApplicationController walmart(){
		if(walmart==null){
			walmart = new ApplicationController();
		}
		return walmart;
	}

	@BeforeTest
	public void setUp(){
		launchBrowser();
		reportTest();
	}

	public static void reportTest(){
		extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentReports/" + "test" + ".html", true);
		test= extent.startTest("Test");
		
	}
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	/*@AfterMethod
	public void afterMethod(ITestResult result,String vpName){

		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String screenshot_path=Utility.captureScreenShot(driver, result.getName());
			String image= test.addScreenCapture(screenshot_path);
			test.log(LogStatus.FAIL, vpName, image);
		}
	}*/
	

	@AfterTest
	public void afterTest(){

		
		extent.endTest(test); //  (reportTest());
		extent.flush();
		
		driver.get(System.getProperty("user.dir") + "\\ExtentReports\\" + "test" + ".html");
		//driver.close();
		//driver.quit();
		
		

	}

}

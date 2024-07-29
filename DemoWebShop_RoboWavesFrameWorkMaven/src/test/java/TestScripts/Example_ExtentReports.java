package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Example_ExtentReports {
	@Test
	
	public void testCase01() {
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./Report/DemoExecution.html");
		ExtentReports report=new ExtentReports();
		
		ExtentTest test=report.createTest("Test Case 01-Verify user is able to Register");
		
		test.log(Status.INFO, "Launching the Browser");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts()
		
	}

}

package PomRepository;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_UsingdifferentAnnotations {
	@AfterTest
	public void afterTest() {
		System.out.println("After Test : Disconnect from DB");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test : Establish the connection to DB");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method : Login");
	}
	@Test
	public void testCase01() {
		System.out.println("Test case 01 pass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method : Logout");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class : close the browser");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class : Launch the browser");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite : Establish the connection to Server");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite : Disconnect from server");
	}
	@Test
	public void testCase02() {
		System.out.println("Test case 02 pass");
	}

}

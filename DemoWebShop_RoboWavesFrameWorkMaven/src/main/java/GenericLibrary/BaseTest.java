package GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomRepository.HomePage;
import PomRepository.LoginPage;




public class BaseTest {
	
	public DataUtility1 data_utility=new DataUtility1();
	public WebDriver driver;
	public static WebDriver listenersDriver;
	public HomePage home_Page;


	@BeforeClass(alwaysRun=true)
	public void launchTheBrowser() throws IOException
	{
		driver=new ChromeDriver();
		listenersDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_utility.getDataFromProperties("url"));
	}

	@BeforeMethod(alwaysRun=true)
	public void perfornLogin() throws IOException
	{
		home_Page=new HomePage(driver);
		home_Page.getLoginLink().click();
		
		LoginPage login_Page=new LoginPage(driver);
		login_Page.getEmailTextField().sendKeys(data_utility.getDataFromProperties("email"));
		login_Page.getPasswordTextField().sendKeys(data_utility.getDataFromProperties("pwd"));
		login_Page.getLoginButton().click();
	}

	@AfterMethod
	public void performLogout()
	{
		home_Page.getLogoutLink().click();
	}

	@AfterClass
	public void closeTheBrowser()
	{
		driver.quit();
	}
	}



	



package PomRepository;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class Example_UsingPomLogin {
public static void main(String[] args) throws IOException {
	 GenericLibrary.DataUtility1 datautil=new GenericLibrary.DataUtility1();
	 //Launch the application and navigate to Test URL
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(datautil.getDataFromProperties("url"));
	 
	 //navigate to login page
	 HomePage hp=new HomePage(driver);
	 hp.getLoginLink().click();
	 //validation
	 if(driver.getTitle().equals("Demo Web Shop. Login"))
	 {
		 
		 System.out.println("login Page displayed");
	 }
	 else
	 {
		 System.out.println("Login Pge is not displayed");
	 }
	 //Performing login
	 LoginPage lp=new LoginPage(driver);
	 lp.getEmailTextField().sendKeys(datautil.getDataFromProperties("email"));
	 lp.getPasswordTextField().sendKeys(datautil.getDataFromProperties("pwd"));
	 lp.getLoginButton().click();
	 //verify user is logged in or not
	boolean result = hp.getLogoutLink().isDisplayed();
	if(result)
	{
		System.out.println("Test Case pass");
	}
	else
	{
		System.out.println("Testcase Fail");
	}
	driver.close();
}

      
      
}

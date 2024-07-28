package PomRepository;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example_usingPomRegister {
	public static void main(String[] args) throws IOException {
		
	 GenericLibrary.DataUtility1 datautil=new GenericLibrary.DataUtility1();
	 //Launch the application and navigate to Test URL
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(datautil.getDataFromProperties("url"));
	 
	 //navigate to register page
	 HomePage hp=new HomePage(driver);
	 hp.getRegisterLink().click();
	 //validation
	 if(driver.getTitle().equals("Demo Web Shop. Register"))
	 {
		 System.out.println("Register Page displayed");
	 }
	 else
	 {
		 System.out.println("Regsiter is not displayed");
	 }
	 //performing register
	 RegisterPage rp=new RegisterPage(driver);
	 rp.getGenderRadioButton().click();
	 rp.getFirstNameTextField().sendKeys(datautil.getDataFromExcel("RegisterData", 1, 0));
	 rp.getLastNameTextField().sendKeys(datautil.getDataFromExcel("RegisterData", 1, 1));
	 rp.getEmailTextField().sendKeys(datautil.getDataFromExcel("RegisterData", 1, 2));
	 rp.getPasswordTextField().sendKeys(datautil.getDataFromExcel("RegisterData", 1, 3));
	 rp.getConfirmPasswordTextField().sendKeys(datautil.getDataFromExcel("RegisterData", 1, 4));
	 rp.getRegisterButton().click();
	 //validation
	 if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/registerresult/1"))
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

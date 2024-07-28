package PomRepository;


import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import GenericLibrary.DataUtility1;



public class Example_UsingPOMAddtoWishlist {

	public static void main(String[] args) throws IOException {
		 DataUtility1 datautil=new DataUtility1();
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
		//Navigate to booksPage
		hp.getBooksLink().click();
		 //validation
		 if(driver.getTitle().equals("Demo Web Shop. Books"))
		 {
			 
			 System.out.println("books Page displayed");
		 }
		 else
		 {
			 System.out.println("books Page is not displayed");
		 }
		 //navigate to FictionEX
		    Books bp=new Books(driver);
		    List<WebElement> allbookslink = bp.getBooksNamesLink();
		    for (WebElement allbooks : allbookslink) 
		    {
				if(allbooks.getText().equals("Fiction EX"))
				{
					allbooks.click();
					break;
				}
			}
		    //validation
			 if(driver.getTitle().equals("Demo Web Shop. Fiction EX"))
			 {
				 
				 System.out.println("fiction ex books Page displayed");
			 }
			 else
			 {
				 System.out.println("fiction ex books Page is not displayed");
			 }
			 //get text
			 FictionEx fp=new FictionEx(driver);
			 WebElement fictions = fp.getFictionExText();
			 String fictiontext = fictions.getText();
			 //add to wishlist
			 
			 fp.getAddtoWishListButton().click();
			 
			 //navigate to wishlist
			 hp.getWishlistLink().click();
			 if(driver.getTitle().equals("Demo Web Shop. Wishlist"))
			 {
				 
				 System.out.println("wishlist Page displayed");
			 }
			 else
			 {
				 System.out.println("wishlist Page is not displayed");
			 }
			 //validation of fictionex
			 Wishlist wp=new Wishlist(driver);
			 WebElement fiction = wp.getFictionExWishListText();
			 String fictionwishtext = fiction.getText();
			 if(fictiontext.equals(fictionwishtext))
			 {
				 System.out.println("FictionEx is added proprly");
			 }
			 else
			 {
				 System.out.println("FictionEx is not added proprly");
			 }
	        //select a checkbox
			 List<WebElement> allremovecart = wp.getRemoveBooksFromcart();
			 for (WebElement allremove : allremovecart) {
				allremove.click();
			}
			 //updatewishlist
			 wp.getUpdateWishlistButton().click();
			 //validation
			 boolean empty = wp.getCartEmptyText().isDisplayed();
			 if(empty)
			 {
				 System.out.println("books removed from cart");
			 }
			 else
			 {
				 System.out.println("books is not removed");
			 }
			 hp.getLoginLink().click();
			 driver.close();

	}

}

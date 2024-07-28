package GenericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomRepository.Books;
import PomRepository.FictionEx;
import PomRepository.Wishlist;



public class WishlistTestCase extends BaseTest {
	 @Test(groups = "integration")
	  public void verify_User_Is_Able_To_Add_Product_To_Wishlist() 
	  {
		  home_Page.getBooksLink().click();
		  //validation
		  SoftAssert s=new SoftAssert();
		  s.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		  Reporter.log("books Page is displayed",true);
		  
			
		  //navigate to books
		  Books books_page=new Books(driver);
		  List<WebElement> allbookslink = books_page.getBooksNamesLink();
		  for (WebElement allbooks : allbookslink) 
		    {
				if(allbooks.getText().equals("Fiction EX"))
				{
					allbooks.click();
					break;
				}
			}
		  //validation
		  Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX");
		  Reporter.log("fiction ex books Page displayed",true);
		  //navigate to fictionex page
				  FictionEx fiction_page=new FictionEx(driver);
		  String expectedtext = fiction_page.getFictionExText().getText();
		  fiction_page.getAddtoWishListButton().click();
		  
		  home_Page.getWishlistLink().click();
		  //validation
		  s.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist");
		  Reporter.log("wishlist Page displayed",true);
		 
		  driver.navigate().refresh();
		  
		  Wishlist wishlist_page=new Wishlist(driver);
		  String actualtext = wishlist_page.getFictionExWishListText().getText();
		  //validation
		  
			  s.assertEquals(actualtext, expectedtext);
			  Reporter.log("verify_User_Is_Able_To_Add_Product_To_Wishlist is pass",true);
			  
			  
		  //remove the products
		  List<WebElement> allremovecheckbox = wishlist_page.getRemoveBooksFromcart();
		  for (WebElement allchecbox : allremovecheckbox) 
		  {
			allchecbox.click();
		   }
		  wishlist_page.getUpdateWishlistButton().click();
		  
		  
	  }
	}


	
		

		




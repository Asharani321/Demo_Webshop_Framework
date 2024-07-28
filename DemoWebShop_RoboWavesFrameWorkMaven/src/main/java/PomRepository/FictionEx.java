package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEx   
{ 
	@FindBy(xpath ="//h1[contains(text(),'Fiction EX')]")
	private WebElement fictionExText;
	    
	@FindBy(xpath ="//input[@value='Add to wishlist']")
	private WebElement addtoWishListButton;
	
	public FictionEx(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }

	public WebElement getFictionExText() {
		return fictionExText;
	}

	public WebElement getAddtoWishListButton() {
		return addtoWishListButton;
	}
	
	
 
}

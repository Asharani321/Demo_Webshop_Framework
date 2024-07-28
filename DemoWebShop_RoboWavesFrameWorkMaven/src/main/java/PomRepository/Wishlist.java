package PomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist 
{
	@FindBy(xpath ="//a[text()='Fiction EX']")
	private WebElement fictionExWishListText;
	 
	@FindBy(xpath ="//input[@name='removefromcart']")
	private List<WebElement> removeBooksFromcart;
	
	@FindBy(xpath ="//input[@value='Update wishlist']")
	private WebElement updateWishlistButton;
	
	@FindBy(xpath ="//div[@class='wishlist-content']")
	private WebElement cartEmptyText;
	
	public Wishlist(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }

	public WebElement getFictionExWishListText() {
		return fictionExWishListText;
	}

	public List<WebElement> getRemoveBooksFromcart() {
		return removeBooksFromcart;
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}

	public WebElement getCartEmptyText() {
		return cartEmptyText;
	}
	
}

package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath ="//a[text()='Register']")
    private WebElement registerLink;
	
	@FindBy(xpath ="//a[text()='Log in']")
    private WebElement loginLink;
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
    private WebElement shoppingCartLink;
	
	@FindBy(xpath ="//span[text()='Wishlist']")
    private WebElement wishlistLink;
	
	@FindBy(xpath ="//input[@value='Search store']")
    private WebElement searchStoreTextField;
	
	@FindBy(xpath ="//input[@value='Search']")
    private WebElement searchButton;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Books')]")
    private WebElement booksLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    private WebElement computersLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    private WebElement electronicsLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")
    private WebElement apparelAndShoesLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
    private WebElement digitalDownloadsLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[@href='/jewelry']")
    private WebElement jeweleryLink;
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[@href='/gift-cards']")
    private WebElement giftCardsLink;
	
	@FindBy(xpath ="//a[text()='Log out']")
    private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }
	
	 public WebElement getLogoutLink() {
		return logoutLink;
	}

	

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchStoreTextField() {
		return searchStoreTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJeweleryLink() {
		return jeweleryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	 

}

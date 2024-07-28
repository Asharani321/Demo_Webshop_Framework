package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage  
{
    @FindBy(id="gender-female")
	private WebElement genderRadioButton;
    
    @FindBy(id="FirstName")
	private WebElement firstNameTextField;
    
    @FindBy(id="LastName")
	private WebElement lastNameTextField;
    
    @FindBy(id="Email")
	private WebElement emailTextField;
    
    @FindBy(id="Password")
	private WebElement passwordTextField;
    
    @FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
    
    @FindBy(id="register-button")
	private WebElement registerButton;
    
    @FindBy(xpath="//div[@class=\"result\"]")
    private WebElement Yourregistrationcompleted;

    
    
    public RegisterPage(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement Yourregistrationcompleted() {
		return Yourregistrationcompleted;
	}
	
	}
    
    


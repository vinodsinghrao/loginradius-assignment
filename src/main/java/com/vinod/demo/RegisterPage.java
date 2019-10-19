package com.vinod.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegisterPage {
	/** Default timeout of waiting for web elements in the page. */
	private final int DEFAULT_ELEMENT_TIMEOUT = 30;
	private final String XPATH_CHILD_ELEMENTS_LOCATOR = ".//*";

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Constructor /////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(
				        driver, DEFAULT_ELEMENT_TIMEOUT), this);
	}

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Web Elements ////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	@FindBy(name = "PostalCode")
	private WebElement postalCode;
	
	@FindBy(name = "address1")
	private WebElement address1;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(id = "loginradius-registration-emailid")
	private WebElement emailId;
	
	@FindBy(id = "loginradius-registration-password")
	private WebElement password;
	
	@FindBy(name = "confirmpassword")
	private WebElement confirmPassword;
	
    @FindBy(id = "loginradius-submit-register")
	private WebElement registerBtn;
    
    @FindBy(name = "securityQuestion0")
	private WebElement securityQuestion;
    
    @FindBy(name = "securityAnswer0")
	private WebElement securityAnswer;
    
    
	
	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Getters /////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public WebElement getEmailTextField() {
		return emailId;
	}

	public WebElement getPasswordTextField() {
		return password;
	}
	public WebElement getPostalCodeTextField() {
		return postalCode;
	}

	public WebElement getAddressTextField() {
		return address1;
	}
	public WebElement getFirstNameTextField() {
		return firstname;
	}

	public WebElement getLastNameTextField() {
		return lastname;
	}
	
	public WebElement getConfirmPasswordTextField() {
		return confirmPassword;
	}

	public WebElement getsecurityQuestionDropDown() {
		return securityQuestion;
	}
	
	public WebElement getsecurityAnswerTestField() {
		return securityAnswer;
	}	

	public WebElement getRegisterBtn() {
		return registerBtn;
	}
   
}

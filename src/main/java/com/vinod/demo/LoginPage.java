package com.vinod.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class LoginPage {

	/** Default timeout of waiting for web elements in the page. */
	private final int DEFAULT_ELEMENT_TIMEOUT = 30;
	private final String XPATH_CHILD_ELEMENTS_LOCATOR = ".//*";
	private final String URL = "https://lr-candidate-demo1.hub.loginradius.com/auth.aspx";

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Constructor /////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(
				        driver, DEFAULT_ELEMENT_TIMEOUT), this);
	
		
	}

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Web Elements ////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	@FindBy(name = "emailid")
	private WebElement emailId;
	
	
	@FindBy(name = "password")
	private WebElement password;
	
    @FindBy(id = "loginradius-submit-login")
	private WebElement loginBtn;
    
    @FindBy(className = "lr-register-link")
  	private WebElement createAccount;
    
    @FindBy(className = "lr-raas-forgot-password")
  	private WebElement forgotPassword;
    
    @FindBy(xpath = "//*[@title='Sign up with Facebook']/span")
  	private WebElement facebookLogin;

	@FindBy(xpath = "//*[@title='Sign up with Google']/span")
  	private WebElement googleLogin;
	
	@FindBy(xpath = "//*[@title='Sign up with Twitter']/span")
  	private WebElement twitterLogin;
	
	@FindBy(id = "loginradius-forgotpassword-emailid")
	private WebElement forgotLoginEmailId;
	
	@FindBy(id = "loginradius-submit-send")
	private WebElement sendBtn;
	
	
	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Getters /////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public WebElement getEmailTextField() {
		return emailId;
	}

	public WebElement getPasswordTextField() {
		return password;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getCreateAccountLink() {
		return createAccount;
	}
	
	public WebElement getForgotPassword(){
		return forgotPassword;	
	}
	
	public WebElement getFacebookLogin() {
		return facebookLogin;
	}

	public WebElement getGoogleLogin() {
		return googleLogin;
	}
	
	public WebElement getTwitterLogin() {
		return twitterLogin;
	}
	
    public WebElement getForgotLoginEmailId() {
        return forgotLoginEmailId;
            	}

    public WebElement getSendBtn() {
        return sendBtn;
            	}
            
    public String getURL() {
        return URL;  
	          
    }
}

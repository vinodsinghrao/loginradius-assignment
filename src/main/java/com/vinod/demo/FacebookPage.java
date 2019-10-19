package com.vinod.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class FacebookPage {

	/** Default timeout of waiting for web elements in the page. */
	private final int DEFAULT_ELEMENT_TIMEOUT = 30;
	private final String XPATH_CHILD_ELEMENTS_LOCATOR = ".//*";
	private final String URL = "https://lr-candidate-demo1.hub.loginradius.com/auth.aspx";

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Constructor /////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(
				        driver, DEFAULT_ELEMENT_TIMEOUT), this);
		
		//PageFactory.initElements(driver, this);
		//PageFactory.initElements(factory, page);
		
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

    public String getURL() {
                return URL;
    }
}

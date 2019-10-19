package com.vinod.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class GoogleLoginPage {

	/** Default timeout of waiting for web elements in the page. */
	private final int DEFAULT_ELEMENT_TIMEOUT = 30;
	private final String XPATH_CHILD_ELEMENTS_LOCATOR = ".//*";

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Constructor /////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public GoogleLoginPage(WebDriver driver) {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(
				        driver, DEFAULT_ELEMENT_TIMEOUT), this);
	}

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Web Elements ////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//*[@id='identifierId']")
	private WebElement emailId;
	
	@FindBy(xpath = "//*[@id='identifierNext']/span")
	private WebElement nextBtn;
    
    @FindBy(xpath = "//*[@id='view_container']*/span")
  	private WebElement createAccount;
    
    @FindBy(xpath = "//*[@title='Forgot email']*/button")
  	private WebElement forgotEmail;
	
	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Getters /////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////
    public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getForgotEmail() {
		return forgotEmail;
	}

    

}

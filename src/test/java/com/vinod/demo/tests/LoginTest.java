package com.vinod.demo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(enabled=true)
	public  void verifyLoginPage() throws InterruptedException {		
        // Navigate to URL.
        getDriver().get(loginPage.getURL());
        //this is third commit
        
        browserWait();
        // Verifying email field is present
        Assert.assertEquals(true,loginPage.getEmailTextField().isDisplayed());
        
        // Verifying password field is present
        Assert.assertEquals(true,loginPage.getPasswordTextField().isDisplayed());
        
        //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getLoginBtn().isDisplayed());
        
        //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getFacebookLogin().isDisplayed());
        
        //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getGoogleLogin().isDisplayed());
        
        //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getTwitterLogin().isDisplayed());
        
        //Verifying forgot Email link is present
        Assert.assertEquals(true,loginPage.getForgotPassword().isDisplayed());
          
        // Wait before closing browser.
        browserWait();
	}
	
	
	@Test(dataProvider="LoginCredentials",enabled=false)
	public  void verifyLogin() throws InterruptedException {
        // Navigate to URL.
        getDriver().get(loginPage.getURL());
        browserWait();
        // Verifying email field is present
        Assert.assertEquals(true,loginPage.getEmailTextField().isDisplayed());
        
        // Verifying password field is present
        Assert.assertEquals(true,loginPage.getPasswordTextField().isDisplayed());
        
        //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getLoginBtn().isDisplayed());
        
        // Type email id
        loginPage.getEmailTextField().sendKeys("rao.vinodsingh@gmail.com");
        
        // Type password
        loginPage.getPasswordTextField().sendKeys("Apple!23");
        
        //Click login
        loginPage.getLoginBtn().click();

        // Wait before closing browser.
        browserWait();
	}
	
	@Test(enabled=false)
	public void verifyFacebookLogin() {
		// Navigate to URL.
        getDriver().get(loginPage.getURL());
        
        loginPage.getFacebookLogin().click();
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);}
        System.out.println(getDriver().getTitle());
        
        //Verifying the new page title 
        Assert.assertEquals(getDriver().getTitle(),"Facebook");
       
 
	}
	
	@Test(enabled=false)
	public void verifyGoogleLogin() {
		// Navigate to URL.
        getDriver().get(loginPage.getURL());
        
      //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getGoogleLogin().isDisplayed());

        loginPage.getGoogleLogin().click();
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);}
        System.out.println(getDriver().getTitle());
        
        //Verifying the new page title 
        Assert.assertEquals( getDriver().getTitle(),"Sign in – Google accounts");
       
	}
	
	@Test(enabled=false)
	public void verifyTwitterLogin() {
		// Navigate to URL.
        getDriver().get(loginPage.getURL());
        
      //Verifying Login button is present
        Assert.assertEquals(true,loginPage.getTwitterLogin().isDisplayed());

        loginPage.getTwitterLogin().click();
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);}
        System.out.println(getDriver().getTitle());
        
        //Verifying the new page title 
        Assert.assertEquals( getDriver().getTitle(),"Twitter / Authorise an application");
       
	}
	
	@Test(enabled=false)
	public void verifyforgotPassword() throws InterruptedException{
		getDriver().get(loginPage.getURL());
		browserWait();
		
		loginPage.getForgotPassword().click();
		browserWait();
		
		loginPage.getForgotLoginEmailId().sendKeys("rao.vinodsingh@gmail.com");
		loginPage.getSendBtn().click();
		
	}
	
	
}

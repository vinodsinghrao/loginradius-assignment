package com.vinod.demo.tests;

	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.demo.vinod.utils.EmailHelper;

	public class GoogleLoginTest extends BaseClass{
		
		@Test(dataProvider="UserCredentials")
		public void verifyGoogleLoginPage(String email) throws Exception {			
			getDriver().get(loginPage.getURL());
			browserWait();
			loginPage.getGoogleLogin().click();
			System.out.println(getDriver().getWindowHandles());
	        for (String handle : getDriver().getWindowHandles()) {
	            getDriver().switchTo().window(handle);}
	        System.out.println(getDriver().getWindowHandles());
		    googleLogin.getEmailId().sendKeys(email);
		    googleLogin.getNextBtn().click();
			
		}
		
		 @DataProvider(name="UserCredentials")
		  public Object[][] getDataFromDataprovider(){
			    return new Object[][]
			    	{
			            { "rao.vinodsingh@gmail.com" },
			            { "knock2vsr@gmail.com" }			        
			        };

			    }

	}
	


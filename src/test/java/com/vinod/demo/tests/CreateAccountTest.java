package com.vinod.demo.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.vinod.utils.EmailHelper;

public class CreateAccountTest extends BaseClass {
	
	
	@Test(dataProvider="NewUserCredentials")
	public  void verifyRegistrationPage(String email,String password) throws Exception {

		getDriver().get(loginPage.getURL());
		browserWait();
		loginPage.getCreateAccountLink().click();
		
		registerPage.getPostalCodeTextField().sendKeys("560068");
		registerPage.getAddressTextField().sendKeys("Test Address");
		registerPage.getFirstNameTextField().sendKeys("Vinod Singh");
		registerPage.getLastNameTextField().sendKeys("Rao");
		registerPage.getEmailTextField().sendKeys(email);
		registerPage.getPasswordTextField().sendKeys(password);
		registerPage.getConfirmPasswordTextField().sendKeys(password);
		
		Select dropdown = new Select(registerPage.getsecurityQuestionDropDown());
		dropdown.selectByIndex(1);
		
		registerPage.getsecurityAnswerTestField().sendKeys("Nick");
		registerPage.getRegisterBtn().click();
		
        // Wait before closing browser.
		browserWait();
        
		//This is for email verification
        //EmailHelper.getPassword("dbtesting4@gmail.com", "pain@2014");
		
	}
	
	 @DataProvider(name="NewUserCredentials")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "rao.vinodsingh@gmail.com", "password123" },
	            { "knock2vsr@gmail.com", "password1234" },
/*	            { "jumpbytetest2@gmail.com", "password124"},
	            { "jumpbytetest3@gmail.com", "password126" },
	            { "jumpbytetest4@gmail.com", "password127" },
	            { "jumpbytetest5@gmail.com", "password128"}*/
	        };

	    }


}

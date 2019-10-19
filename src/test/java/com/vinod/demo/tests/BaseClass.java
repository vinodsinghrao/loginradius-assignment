package com.vinod.demo.tests;

import java.util.logging.Logger;

import com.vinod.demo.GoogleLoginPage;
import com.vinod.demo.LoginPage;
import com.vinod.demo.RegisterPage;
import com.vinod.demo.drivers.ThreadLocalDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    protected ThreadLocalDriver threadLocalDriver;
    protected Logger logger = Logger.getGlobal();

    // Define Login Page object for Demo site.
    protected LoginPage loginPage;
    
    // Define Registration Page object for Demo site.
    protected RegisterPage registerPage;
    
    // Define Registration Page object for Demo site.
    protected GoogleLoginPage googleLogin;

    // Define timeout before closing browser after test.
    protected final int BROWSER_WAIT_MILLISECONDS = 4000;
    
    protected WebDriver driver;

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// TestNG Methods //////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    void setTestConfiguration() {
        logger.info("Setting up Demo site..");
        threadLocalDriver = new ThreadLocalDriver();
        loginPage = new LoginPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        googleLogin = new GoogleLoginPage(getDriver());

    }

    @AfterMethod
    void closeBrowser() {
        logger.info("Tearing down Demo site Test..");
        getDriver().quit();
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Generic Methods /////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    protected void browserWait() throws InterruptedException {
        Thread.sleep(BROWSER_WAIT_MILLISECONDS);
    }
    
    
    protected WebDriver getDriver() {
        return threadLocalDriver.getDriver();
    }
}

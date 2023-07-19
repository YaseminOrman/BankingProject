package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_LoginTest_001 {

    private static Logger logger = LogManager.getLogger(TC_LoginTest_001.class.getName());


    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        logger.info("url is opened");
        LoginPage loginPage=new LoginPage();
        loginPage.txtUserName.sendKeys(ConfigReader.getProperty("login_username"));
        logger.info("Entered username");
        loginPage.txtPassword.sendKeys(ConfigReader.getProperty("login_password"));
        logger.info("Entered password");
        loginPage.btnLogin.click();
        Assert.assertTrue(loginPage.guru99Text.isDisplayed());
        logger.info("Login test passed");
    }

}

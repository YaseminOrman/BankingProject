package tests;


import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_LoginDDT_002 {
    @Test
    public void loginDDT(){
        LoginPage loginPage=new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        loginPage.txtUserName.sendKeys("login_username");
        loginPage.txtPassword.sendKeys("login_password");
        loginPage.btnLogin.click();
        if(isAlertPresent()==true){
            Driver.getDriver().switchTo().alert().accept();
            Driver.getDriver().switchTo().defaultContent();
            Assert.assertTrue(false);
        }
        else{
            Assert.assertTrue(true);
        }

    }
    public boolean isAlertPresent(){//to check alert is present or not
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }

}

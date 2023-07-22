package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddCostumerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.ReusableMethods.getScreenshot;
import static utilities.ReusableMethods.waitFor;

public class TC_AddCustomerTest_003 {
    @Test
    public void addNewCustomer() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        LoginPage loginPage=new LoginPage();
        loginPage.txtUserName.sendKeys(ConfigReader.getProperty("login_username"));
        loginPage.txtPassword.sendKeys(ConfigReader.getProperty("login_password"));
        loginPage.btnLogin.click();
        waitFor(2);
        AddCostumerPage addCostumerPage=new AddCostumerPage();
        addCostumerPage.newCustomerButton.click();
        waitFor(3);
        addCostumerPage.alertDismissButton.click();
        waitFor(2);
        addCostumerPage.customerName.sendKeys(ConfigReader.getProperty("customer_name"));
        addCostumerPage.rdGender.sendKeys(ConfigReader.getProperty("customer_gender"));
        addCostumerPage.dob.sendKeys(ConfigReader.getProperty("customer_dob"));
        addCostumerPage.address.sendKeys(ConfigReader.getProperty("customer_address"));
        addCostumerPage.cityName.sendKeys(ConfigReader.getProperty("customer_city"));
        addCostumerPage.stateName.sendKeys(ConfigReader.getProperty("customer_state"));
        addCostumerPage.PinNumber.sendKeys(ConfigReader.getProperty("customer_pinno"));
        addCostumerPage.telNumber.sendKeys(ConfigReader.getProperty("customer_tel"));
        String customerEmail=randomString()+"gmail.com";
        addCostumerPage.email.sendKeys(customerEmail);
        addCostumerPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        addCostumerPage.submitButton.click();
        waitFor(3);
        boolean result=Driver.getDriver().getPageSource().contains("Customer Register Successfully!!!");
        if(result==true){
            Assert.assertTrue(true);
        }else{
            getScreenshot("addNewCustomer");
            Assert.assertTrue(false);
        }

    }
    public String randomString(){
       String generatedString = RandomStringUtils.randomAlphabetic(8);
       return(generatedString) ;
    }
}

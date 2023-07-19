package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pages.AddCostumerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_AddCustomerTest_003 {
    @Test
    public void addNewCustomer(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        AddCostumerPage addCostumerPage=new AddCostumerPage();
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

    }
    public String randomString(){
       String generatedString = RandomStringUtils.randomAlphabetic(8);
       return(generatedString) ;
    }
}

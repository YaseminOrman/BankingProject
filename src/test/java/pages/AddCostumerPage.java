package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddCostumerPage {
    public AddCostumerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "name")
    public WebElement customerName;
    @FindBy(name = "rad1")
    public WebElement rdGender;
    @FindBy(id = "dob")
    public WebElement dob;
    @FindBy(name = "addr")
    public WebElement address;
    @FindBy(name = "city")
    public WebElement cityName;
    @FindBy(name = "state")
    public WebElement stateName;
    @FindBy(name = "pinno")
    public WebElement PinNumber;
    @FindBy(name = "telephoneno")
    public WebElement telNumber;
    @FindBy(name = "emailid")
    public WebElement email;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
}

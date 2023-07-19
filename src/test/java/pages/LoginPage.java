package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
   public LoginPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(name = "uid")
    public WebElement txtUserName;
   @FindBy(name = "password")
    public WebElement txtPassword;
   @FindBy(name = "btnLogin")
    public WebElement btnLogin;
   @FindBy(xpath = "//h2")
    public WebElement guru99Text;
}

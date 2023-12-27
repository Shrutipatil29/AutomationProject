package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    //webelement email= driver.findElement(By.xpath("input[@id='email']"));

    @FindBy (xpath = "//input[@id='email']")private WebElement email;
    @FindBy (xpath = "//input[@id='pass']")private WebElement password;
  @FindBy (xpath = "//button[@value='1']")private WebElement login;
//   @FindBy (xpath = )private WebElement forgotPassword;
//   @FindBy (xpath = )private WebElement createNewAccount;

    public FacebookLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void enterEmailId(String mailId)
    {
        email.sendKeys(mailId);
    }
    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void clickOnLogin()
    {
       login.click();

    }


}

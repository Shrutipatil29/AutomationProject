package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    //webelement email= driver.findElement(By.xpath("input[@id='email']"));

    @FindBy(xpath = "//input[@name='firstname']")private WebElement firstname ;
    @FindBy (xpath = "//input[@name='lastname']")private WebElement lastname;
    @FindBy (xpath = "//input[@name='reg_email__']")private WebElement email;
     @FindBy (xpath = "//input[@name='reg_passwd__']")private WebElement Password;
     @FindBy (xpath = "//select[@id='day']")private WebElement Day;
     @FindBy (xpath = "//select[@id='month']")private WebElement Month;
     @FindBy (xpath = "//select[@id='year']")private WebElement Year;
     @FindBy (xpath = "(//input[@name='sex'])[1]")private WebElement Gender;
    @FindBy (xpath = "(//button[@type='submit'])[1]")private WebElement button;

    public void openBrowser(){

    }



    public FacebookLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void enterEmailId(String firstname)
    {
        email.sendKeys(firstname);
    }
    public void enterPassword(String lastname)
    {
        Password.sendKeys(lastname);
    }

    public void clickOnLogin()
    {
        button.click();

    }


}



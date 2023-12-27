package Testing;

import Basic.Launchbrowser;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginTest {

    @AfterMethod
    public  void closeBrowser(){
        driver.close();
    }

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        driver = Launchbrowser.chrome("https//www.facebook.com") ;
    }

    @Test
    public void loginWithValidUserNameAndPassword(){
        FacebookLoginPage facebookLoginPage= new FacebookLoginPage(driver);
        facebookLoginPage.enterEmailId("shrutipatil29596@gmail.com");
        facebookLoginPage.enterPassword("123456");
        facebookLoginPage.clickOnLogin();
    }

    @Test
    public void loginWithValidUsernameAndInvalidPassword(){
        FacebookLoginPage facebookLoginPage= new FacebookLoginPage(driver);
        facebookLoginPage.enterEmailId("Arise@gmail.com");
        facebookLoginPage.enterPassword("123456");
        facebookLoginPage.clickOnLogin();

    }


}

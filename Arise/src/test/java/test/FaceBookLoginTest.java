package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pojo.browser;
import pom.FacebookLoginPage;


@Listeners(test.Listeners.class)
public class FaceBookLoginTest {




    @AfterMethod
    public  void closeBrowser(){
        driver.close();
    }


    WebDriver driver;

    @Test
    public void openBrowser(){
        driver = browser.chrome("https//www.facebook.com") ;
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




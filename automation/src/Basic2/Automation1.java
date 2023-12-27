package Basic2;

import Apache.Parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Automation1 {


    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver(); //upcasting

        driver.get("https://www.facebook.com/"); //helps to open url on browser

        driver.manage().window().maximize();

        String emailId = Parameterization.getExcelData(0,0);
        WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(emailId);

        String password = Parameterization.getExcelData(1,0);
        WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys(password);





        //TagName: when we find element using tagname is called as locator by tagname
        //Tagname are not always unique, so we cannot find every element using tagname


        //By using findElement method of webDriver Interface which accepts locators as arguments
        // and returns webElement interface , then by using methods of webElement interface we can perform action on web page element



//        WebElement email= driver.findElement(By.id("email"));
//        email.sendKeys("shrutipatil29596@gmail.com");
//
//        WebElement password= driver.findElement(By.id("pass"));
//        password.sendKeys("Shinshan@29");
//
//        WebElement logIn= driver.findElement(By.tagName("button"));
//        logIn.click();

        //WebElement email= driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
        //WebElement password= driver.findElement(By.cssSelector("input[id='pass']"));
        //WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));

        //LinkText

//        WebElement forgot= driver.findElement(By.linkText("Forgotten password?"));
//        forgot.click();

        //Partial LinkText

        //WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));
        //forgot.click();






    }
}

package Apache;

import Apache.Parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class facebook {


    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver(); //upcasting

        driver.get("https://www.facebook.com/"); //helps to open url on browser

        //driver.manage().window().maximize();

        String emailId = Parameterization.getExcelData(0, 0);
        System.out.println(emailId);
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(emailId);

        String password = Parameterization.getExcelData(1, 0);
        System.out.println(password);
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys(password);

    }
}
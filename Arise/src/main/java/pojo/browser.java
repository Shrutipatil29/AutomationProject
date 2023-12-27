package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {


        public static WebDriver chrome(String url) {

            System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver(); //upcasting

            driver.get("https://www.facebook.com/"); //helps to open url on browser

            return driver;
        }
}

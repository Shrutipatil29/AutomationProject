package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
    public static WebDriver chrome(String url) {

        System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver(); //upcasting

        driver.get(url); //helps to open url on browser

        return driver;
    }

        //whenever a method returns an interface it returns all the methods of interface as complete
        //Navigation nav = driver.navigate();//navigate method of webdriver interface returns Navigation Interface
        //nav.back();//back method of navigation interface helps us to go back on browser
//
//        driver.navigate().back(); //method chaining
//
//       Thread.sleep(2000);// will stop java execution for mentioned time
//
//        driver.navigate().forward();
//       Thread.sleep(2000);
//        driver.navigate().refresh();
//        String title = driver.getTitle();
//        System.out.println(title); //helps to get title of webpage
//        String url = driver.getCurrentUrl();//helps to get url of current page
//        System.out.println(url);
//
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//
//        Dimension d= new Dimension(500,1000);
//        driver.manage().window().setSize(d);
//        Thread.sleep(2000);
//
//        Point p= new Point(500,600);
//        driver.manage().window().setPosition(p);
//
//        driver.close();

    }



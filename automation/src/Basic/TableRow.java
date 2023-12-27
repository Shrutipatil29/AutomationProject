package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableRow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver(); //upcasting

        driver.get("https://demo.guru99.com/test/web-table-element.php#"); //helps to open url on browser


        List<WebElement> row= driver.findElements(By.xpath("(//table//tbody)[2]//tr//td"));

        for(int i=0;i< row.size();i++)
        {
           String rows =row.get(i).getText();
            double price= Double.parseDouble(rows);

        }




    }

}

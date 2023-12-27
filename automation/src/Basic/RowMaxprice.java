package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RowMaxprice {


    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "/Users/ac02d77qnmd6m/Downloads/chromedriver-mac-x64/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/web-table-element.php#");

            List<WebElement> rows = driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));



        double maxPrice = Double.MIN_VALUE;
            for (int i = 1; i < rows.size(); i++) {

                String priceText = rows.get(i).getText();
                double price = Double.parseDouble(priceText);

                if (price > maxPrice) {
                    maxPrice = price;
                }
            }

            System.out.println("Maximum Current Price is: rs" + maxPrice);


        }
    }



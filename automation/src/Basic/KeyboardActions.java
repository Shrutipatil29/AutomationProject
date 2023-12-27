package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Launchbrowser.chrome("https://demoqa.com/text-box");
        WebElement firstName = driver.findElement(By.xpath("//input[@id='userName']"));
        firstName.sendKeys("Shruti");

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.TAB);
        actions.sendKeys("shrutiypatil1205@gmail.com");

        actions.sendKeys(Keys.TAB);
        actions.sendKeys("Baner Pune");

       actions.keyDown(Keys.CONTROL);
       actions.sendKeys("a");
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);

        actions.sendKeys(Keys.TAB);
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);

        actions.build().perform();

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        actions.click(submit);
        actions.perform();






    }
}

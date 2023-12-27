package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LoopMouseAction {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Launchbrowser.chrome("https://www.globalsqa.com/demo-site/draganddrop/");
        Thread.sleep(1000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

        driver.switchTo().frame(iframe);
        List<WebElement> images = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions actions = new Actions(driver);

        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            actions.dragAndDrop(image, trash);
            actions.perform();
            Thread.sleep(1000);

        }

        List<WebElement> recycle = driver.findElements(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])"));
        for (int j = 0; j < recycle.size(); j++) {
            WebElement rightClick = recycle.get(j);
            actions.click(rightClick);
            actions.perform();
            Thread.sleep(1000);
        }
    }
}

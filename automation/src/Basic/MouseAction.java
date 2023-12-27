package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= Launchbrowser.chrome("https://www.globalsqa.com/demo-site/draganddrop/");
         Thread.sleep(1000);
        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

        driver.switchTo().frame(iframe);

        WebElement image1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));

        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image1,trash);
        actions.perform();

        WebElement image2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));

        WebElement bin = driver.findElement(By.xpath("//div[@id='trash']"));


        actions.dragAndDrop(image2,bin);
        actions.perform();

        WebElement image3 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]"));

        WebElement move = driver.findElement(By.xpath("//div[@id='trash']"));


        actions.dragAndDrop(image3,move);
        actions.perform();

        WebElement image4 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]"));

        WebElement bin2 = driver.findElement(By.xpath("//div[@id='trash']"));


        actions.dragAndDrop(image1,bin2);
        actions.perform();


        WebElement trash2 = driver.findElement(By.xpath("//div[@id='trash']"));
        actions.moveToElement(trash2);
        actions.perform();

        WebElement rightClick = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[1]"));
        actions.contextClick(rightClick);
        actions.perform();

        WebElement rightClick2 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[2]"));
        actions.contextClick(rightClick2);
        actions.perform();

        WebElement rightClick3 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[3]"));
        actions.contextClick(rightClick3);
        actions.perform();

        WebElement rightClick4 = driver.findElement(By.xpath("(//a[@class='ui-icon ui-icon-refresh'])[4]"));
        actions.contextClick(rightClick4);
        actions.perform();



    }


}
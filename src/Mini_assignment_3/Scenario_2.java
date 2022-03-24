package Mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium jars and drivers\\drivers\\chrome drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
       driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        Actions act=new Actions(driver);

        act.dragAndDrop(source, target).build().perform();

    }
}

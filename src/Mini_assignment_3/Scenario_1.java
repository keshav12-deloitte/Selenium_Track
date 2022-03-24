package Mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium jars and drivers\\drivers\\chrome drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/frames']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("frame-top");
        System.out.println(driver.switchTo().frame("frame-left").getTitle());
        Thread.sleep(2000);
        driver.close();

    }
}

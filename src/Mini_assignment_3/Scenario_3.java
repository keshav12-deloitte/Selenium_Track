package Mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium jars and drivers\\drivers\\chrome drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        System.out.println(driver.switchTo().alert().getText());
        String expected="You entered: Ex-Test";
        driver.switchTo().alert().sendKeys("Ex-Test");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(expected.equals(result)==true)
        {
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");

    }
}

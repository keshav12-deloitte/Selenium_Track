package Mini_assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium jars and drivers\\drivers\\chrome drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        if (driver.getTitle().contains("PHPTRAVELS"))
            System.out.println("Page title contains\"PHPTRAVELS");
        else
            System.out.println("\"Page title doesn't contains\"PHPTRAVELS");
        String s1=driver.getTitle();
        driver.findElement(By.xpath("//a[@class='lvl-0 sign-in btn btn-md btn-white-outline']")).click();
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        if(driver.getTitle().contains(s1))
        {
            System.out.println("pass");
        }
        else
            System.out.println("Fail");
        Thread.sleep(8000);
        driver.quit();

    }
}

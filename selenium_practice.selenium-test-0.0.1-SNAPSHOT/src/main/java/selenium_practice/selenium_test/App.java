package selenium_practice.selenium_test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class App 
{
  public static void main( String[] args ) throws Exception
    {
	  //invoke chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //maximize window
        driver.manage().window().maximize();
        //invoke a browser
        driver.get("https://flipkart.com");
        Thread.sleep(1000);
        //locators
        driver.findElement(By.className("Pke_EE")).sendKeys("tab");
        driver.findElement(By.className("Pke_EE")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("KzDlHZ")).click();
        Thread.sleep(1000);
        //window handle
        List<String> Windows= driver.getWindowHandles().stream().collect(Collectors.toList());
        driver.switchTo().window(Windows.get(1));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//ul[@class='row']//button)[1]")).click();
        driver.findElement(By.className("_23FHuj")).click();
        
        
        
       
       


        
        
    }
}

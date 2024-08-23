package selenium_practice.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//invoke chrome
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        
	        
	        //implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        
	        //maximize window
	        driver.manage().window().maximize();
	        
	        
	        //invoke a url; booking flight
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        
	        
	        //locators
	        
	        //static drop down ;select currency
	        
	        
	        WebElement StaticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	        Select dropdown= new Select(StaticDropdown);
	        dropdown.selectByIndex(3);
	        System.out.println(dropdown.getFirstSelectedOption().getText());
	        
	        
	        //OR dropdown.selectByValue("INR");
	        //System.out.println(dropdown.getFirstSelectedOption().getText());
	        //dropdown.selectByVisibleText("AED");
	        //System.out.println(dropdown.getFirstSelectedOption().getText());
            //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	        
	        
	        //Dynamic dropdown using while and for loop ; select passenger number
	        
	        
	        driver.findElement(By.id("divpaxinfo")).click();
	        int i=1;
	       // while(i<4)
	       // {
	        	//driver.findElement(By.id("hrefIncAdt")).click();
	        	//i++;
	       //}
	         for(i=1;i<=4;i++)
	         {
	        	 driver.findElement(By.id("hrefIncAdt")).click();
	         }
	        	 
	         driver.findElement(By.id("btnclosepaxoption")).click();
	         
	         
	         //select locations
	         
	         driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	         driver.findElement(By.xpath("//a[@value='CCU']")).click();
	         driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='VTZ']")).click();
	         driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
	         
	         driver.findElement(By.id("autosuggest")).sendKeys("ind");
	        
	         
	         
	        
	        
	}
}


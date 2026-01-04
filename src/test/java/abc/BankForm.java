package abc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BankForm {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.finapi.io/en/free-trial/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,700)");
	
	driver.findElement(By.id("wpforms-14814-field_1")).sendKeys("FirstName");
	Thread.sleep(2000);
	
	driver.findElement(By.id("wpforms-14814-field_1-last")).sendKeys("LastName");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,200)");
	
	driver.findElement(By.id("wpforms-14814-field_15")).sendKeys("Job Title");
	Thread.sleep(2000);
	
	driver.findElement(By.id("wpforms-14814-field_2")).sendKeys("Business Email");
	Thread.sleep(2000);
	
	
	driver.findElement(By.id("wpforms-14814-field_3")).sendKeys("Mobile Number");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,100)");
	
	String a2=driver.findElement(By.xpath("//div[contains(text(),'Please note: Be sure to enter your personal business email address. Private email addresses, such as gmail, gmx or yahoo, are not allowed! Likewise, role-based general company addresses, such as info@, admin@ or webmaster@, are not possible. If you do not have a personal business email address, please send us a message to kontakt@finapi.io.')]")).getText();
	System.out.println(a2);
	Thread.sleep(2000);

	driver.findElement(By.id("wpforms-14814-field_5")).sendKeys("Company Name");
	Thread.sleep(2000);
	
	driver.findElement(By.id("wpforms-14814-field_14")).sendKeys("URL");
	Thread.sleep(2000);
	
	Actions a = new Actions(driver);
	a.click(driver.findElement(By.id("wpforms-14814-field_9_4"))).build().perform();
	Thread.sleep(2000);
	
	a.click(driver.findElement(By.id("wpforms-14814-field_6_1"))).build().perform();
    Thread.sleep(2000);	
	
    driver.findElement(By.id("wpforms-14814-field_7")).sendKeys("Selenium Automation");
    js.executeScript("window.scrollBy(0,200)");
    Thread.sleep(2000);	
 

    
 a.click(driver.findElement(By.xpath("//input[@id=\"wpforms-14814-field_10_1\"]"))).build().perform();
 Thread.sleep(2000);
 
 a.click(driver.findElement(By.xpath("//input[@id=\"wpforms-14814-field_12_2\"]"))).build().perform();
Thread.sleep(10000);
  
	driver.findElement(By.id("wpforms-submit-14814")).click();
	
	String a1 =driver.findElement(By.xpath("//div[contains(text(),'Just to prove you are a human, please answer the following math challenge. ')]")).getText();
	System.out.println(a1);
	
	driver.quit();
	
	}

}

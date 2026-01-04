package DemoQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alertsWindows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");

	                // Single Alert 
		//
		        
/*		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		*/
		  
		      // Alert Click after 5 Sec
	/*	driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(7000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		*/
		
		// Confirm & Not Alert 
/*		driver.findElement(By.id("confirmButton")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		*/
		
		driver.findElement(By.id("promtButton")).click();
		Alert a=driver.switchTo().alert();
		String Alert =a.getText();
		a.sendKeys("Abc");
		System.out.println(Alert);
		a.accept();
		
	
		
	
		
		
		
		
	}

}

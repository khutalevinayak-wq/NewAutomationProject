package Tools__QA;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Date____Select {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)"); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("tabButton")).click();
	Thread.sleep(2000);
	
	Alert a =driver.switchTo().alert();
	a.getText();
	System.out.println(a);
	
	
	
	
	
	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,2000)");  
	

	
	
	
	
	
	
}



}

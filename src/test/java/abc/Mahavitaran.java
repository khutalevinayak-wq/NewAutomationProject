package abc;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mahavitaran {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mahadiscom.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("English")).click();
		
		Alert a =driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Close")).click();
		
		
		//Thread.sleep(2000);
		//WebElement wb= driver.findElement(By.xpath("//h2[contains(text(),'Consumer Portal')]"));
		WebElement wb= driver.findElement(By.xpath("//h2[@aria-label='Consumer Portal']"));

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,5000)");
		
		

		
	
		//js.executeScript("arguments[0].scrollIntoView();", wb);
		js.executeScript("arguments[0].click();", wb);                //javascript 
		
		System.out.println("pass");

}

}

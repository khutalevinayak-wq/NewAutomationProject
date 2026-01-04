package alerts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testautomationstudio.com/demo/actions/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		Actions a = new Actions(driver);                                         // actions objects
//		a.doubleClick(driver.findElement(By.id("action1"))).build().perform();   // single click
//		a.doubleClick(driver.findElement(By.id("action1A"))).build().perform(); // double click
		
		
	//	a.contextClick(driver.findElement(By.id("action1"))).build().perform();      //  contect Click
		driver.findElement(By.id("action2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("action3")).sendKeys("https://www.testautomationstudio.com/demo/actions/#");  //link enter
		
		
		System.out.println("pass");
		

	}

}



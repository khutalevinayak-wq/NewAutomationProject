package alerts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag___Drop {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.testautomationstudio.com/demo/actions/#");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.MILLISECONDS);
	
	Actions a = new Actions(driver);

	//a.moveToElement(driver.findElement(By.linkText("Item 1"))).build().perform();
	
	
	
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.id("nameMenu")).click();

	
	System.out.println("passd");

}}
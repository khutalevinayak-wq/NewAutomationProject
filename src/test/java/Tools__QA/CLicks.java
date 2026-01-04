package Tools__QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class CLicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeAsyncScript("window.scrollBy(0,300)");
		
	
		
		driver.findElement(By.id("item-3")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("rightClickBtn")).click();
		
		
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        Actions act = new Actions(driver);
     	act.contextClick(rightClickBtn).perform();
		
		
	//	WebElement RClick=driver.findElement(By.id("rightClickBt"));
	//	Actions a = new Actions(driver);
	//	a.contextClick(RClick).perform();
		
		
		
		
		
		

	}

}

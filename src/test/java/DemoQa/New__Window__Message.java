package DemoQa;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New__Window__Message {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
		Thread.sleep(2000);		
		
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		
		
	Set<String> windowHandles=driver.getWindowHandles();
		
		Iterator<String> it=windowHandles.iterator();
		
		String parent=it.next();
		
		String child=it.next();
		
		driver.switchTo().window(child);
		
	String ab=	driver.findElement(By.xpath("//html")).getText();
	System.out.println(ab);
		driver.quit();
	}

}

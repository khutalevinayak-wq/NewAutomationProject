package shopping;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("samsung tv");
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]//*[name()='svg']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		 
		
		driver.findElement(By.xpath("//div[contains(text(),'Samsung 80 cm (32 Inch) HD Ready LED Smart Tizen TV with Bezel-Free Design | PurColor | Hyper Real Pic...')]")).click();
	   
		
		Set<String> windowHandles=driver.getWindowHandles();
		
		Iterator<String> it=windowHandles.iterator();
		
		String parent=it.next();
		
		String child=it.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
	//	WebElement b=driver.findElement(By.xpath("//button[@type=\"button\"]"));
	//	js.executeScript("arguments.click()",b);
	
	
		
		
		
		driver.close();
		
		
	}

}

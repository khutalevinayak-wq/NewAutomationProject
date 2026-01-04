package shopping;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Camera_shoping {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("camera for home security");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
	
	    driver.findElement(By.xpath("//span[contains(text(),'Google Nest Cam Outdoor or Indoor, Battery - 2nd Generation - 2 Count (Pack of 1)')]")).click();
	Thread.sleep(2000);
	    driver.findElement(By.id("buy-now-button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("ap_email_login")).sendKeys("Vinayak@1000.gmail.com");
	    driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("ap_password")).sendKeys("abcd@0990");
	    Thread.sleep(2000);
	    driver.findElement(By.id("signInSubmit")).click();
	    Thread.sleep(2000);
	    
	    
		driver.close();
	}

}

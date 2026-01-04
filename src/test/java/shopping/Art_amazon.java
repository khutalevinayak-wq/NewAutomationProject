package shopping;

import java.util.concurrent.TimeUnit;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Art_amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		WebElement sub=driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(sub);
		s.selectByValue("search-alias=kitchen-intl-ship");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("spoon");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Amazon Basics Disposable Clear Plastic Spoons, Premium Quality, 100 Count, Large Pack')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("buy-now-button")).click();
		Thread.sleep(2000);
		  driver.findElement(By.id("ap_email_login")).sendKeys("Vinayak@1000.gmail.com");
		    driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
		    
		    
		
		
		driver.close();
		
		
		
		
	}

}

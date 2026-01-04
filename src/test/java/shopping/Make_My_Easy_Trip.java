package shopping;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Easy_Trip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Trains')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtfrom")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtdesticity")).sendKeys("Solapur");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lblmulcity")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("SearchAll")).click();
		
		
	}

}

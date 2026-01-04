package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cabbooking {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Cabs")).click();
		driver.findElement(By.id("airport")).click();
	driver.findElement(By.id("pickup")).click();
		
	//	driver.findElement(By.id("hrlysrc")).sendKeys("Kolhapur Airport");
		driver.findElement(By.linkText(" From")).sendKeys("Pune");
	//	driver.findElement(By.id("a_FromSector_show")).click();
		
	}

}

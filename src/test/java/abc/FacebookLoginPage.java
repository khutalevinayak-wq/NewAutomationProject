package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


 // https://www.facebook.com

public class FacebookLoginPage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	//	driver.findElement(By.name("email")).sendKeys("Vinayakk");
		
	//	driver.findElement(By.id("pass")).sendKeys("AAa");
		
	//	driver.findElement(By.name("login")).click();
		
		
	//	driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.partialLinkText("Create new")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Vinayak");
		
		driver.findElement(By.name("lastname")).sendKeys("Khutale");

	}

}

package Github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://web.whatsapp.com/");
		driver.get("https://github.com/");
		
		driver.manage().window().maximize();
		
	//	driver.findElement(By.className("/login")).click();
		
	//	driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.name("login")).sendKeys("Vinayak Khutale");
		
		driver.findElement(By.name("password")).sendKeys("Vinayakk@2002");
		
		driver.findElement(By.name("commit")).click();
		
	}

}

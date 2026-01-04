package Instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InstagramLogin {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");  // Open Insta.         username
		
		driver.manage().window().maximize();  // size max 
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Vinayak Khutale");
		
		driver.findElement(By.name("password")).sendKeys("Vinayak@2002");
		
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	 String val=	driver.findElement(By.xpath("//*[contains(text(),'Sorry, your password was incorrect. Please double-check your password.')]")).getText();
		
      	System.out.println(val);
		
		
		
	
		
		
		
	}

}

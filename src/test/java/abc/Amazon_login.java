package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_login {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//	driver.findElement(By.id("ap_email_login")).sendKeys("9763009944");
			driver.findElement(By.name("email")).sendKeys("vinayakkhutale0006@gmail.com");
			
         	driver.findElement(By.id("continue")).click();
        	driver.findElement(By.className("a-button-input")).click();
			driver.findElement(By.name("customerName")).sendKeys("Vinayak Khutale");
			driver.findElement(By.id("ap_password")).sendKeys("Vinayak");
			driver.findElement(By.id("ap_password_check")).sendKeys("Vinayak");
			driver.findElement(By.id("continue")).click();
			
		
	}

}

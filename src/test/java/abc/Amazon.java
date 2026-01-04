package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
     //	driver.findElement(By.name("site-search")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-page"));
		driver.findElement(By.name("submit.addToCart")).click();
		driver.findElement(By.id("nav-cart-count")).click();
	//	driver.findElement(By.className("nav-cart-icon nav-sprite")).click();
//		driver.findElement(By.className("a-icon a-icon-base-trash")).click();
		//driver.findElement(By.id("nav-cart")).click();
		//driver.findElement(By.id("glow-ingress-line1")).click();
		
	//	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//	driver.findElement(By.id("ap_email_login")).sendKeys("9763009944");
	//	driver.findElement(By.name("email")).sendKeys("vinayakkhutale0006@gmail.com");
		
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.className("a-button-input")).click();
//		driver.findElement(By.name("customerName")).sendKeys("Vinayak Khutale");
//		driver.findElement(By.id("ap_password")).sendKeys("Vinayak");
//		driver.findElement(By.id("ap_password_check")).sendKeys("Vinayak");
//		driver.findElement(By.id("continue")).click();
		
		
	}
}

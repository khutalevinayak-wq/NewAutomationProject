package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class order1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(12000);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;      
		js.executeScript("window.scrollBy(0,2000)"); 
		
		
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Aaaaaaaaaaaaa");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Ddddddddddddddd");
		Thread.sleep(2000);
		
		driver.findElement(By.name("postalCode")).sendKeys("abcd1234");
		
		driver.findElement(By.name("continue")).click();
		
		JavascriptExecutor j1 = (JavascriptExecutor) driver;  
		j1.executeScript("window.scrollBy(0,2000)");      
		
		String s=driver.findElement(By.xpath("//div[contains(text(),'Price Total')]")).getText();
		System.out.println(s);
		
		String t=driver.findElement(By.xpath("//div[contains(text(),'Item total: $')]")).getText();
		System.out.println(t);
		
		String r=driver.findElement(By.xpath("//div[contains(text(),'Tax: $')]")).getText();
		System.out.println(r);
		
		String u=driver.findElement(By.xpath("//div[contains(text(),'Total: $')]")).getText();
		System.out.println(u);
		
		
		
		
		driver.findElement(By.name("finish")).click();
		
		String a=driver.findElement(By.xpath("//span[contains(text(),'Checkout: Complete')]")).getText();
		System.out.println(a);
		
		String ab=driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
		System.out.println(ab);
		
		String ac=driver.findElement(By.xpath("//div[contains(text(),'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]")).getText();
		System.out.println(ac);
		
		
		
		
		
		
		driver.close();
		
		
	}

}

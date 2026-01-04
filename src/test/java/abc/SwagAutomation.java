package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class SwagAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(15000);
		
		//Alert b=driver.switchTo().alert();
		//b.accept();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Abcd Efgh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("mmmmmmm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("1234567");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
		Thread.sleep(2000);
		
		
		String sb=driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
		String sa=driver.findElement(By.xpath("//div[contains(text(),'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]")).getText();
		
	   
	    System.out.println(sb);
	System.out.println(sa);
	  System.out.println("pass");
		
		
		
		
		//driver.close();
		
	}

}

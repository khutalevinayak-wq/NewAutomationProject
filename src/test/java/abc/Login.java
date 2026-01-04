package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Abcd123");
		driver.findElement(By.name("password")).sendKeys("A@1342");
	String s=	driver.findElement(By.xpath("//p[contains(text(),'Test with a dummy username and password.')]")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//input[@value=\"login\"]")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		a.accept();
	System.out.println(	driver.findElement(By.xpath("//h1[contains(text(),'Example Domain')]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'This domain is for use in documentation examples without needing permission. Avoid use in operations.')]")).getText());
		//
		
		
		
		
		
		
	}

}

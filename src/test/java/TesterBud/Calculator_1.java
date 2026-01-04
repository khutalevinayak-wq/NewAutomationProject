package TesterBud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
	//	Thread.sleep(3000);
		
		

		

	}

}

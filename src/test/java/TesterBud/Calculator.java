package TesterBud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://schobbish.com/calc/calc2/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//td[@class=\"six\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"add\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"three\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class=\"equals\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}

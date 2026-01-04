package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("ABC1213@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc@120");
		driver.findElement(By.xpath("//button[@class=\" _aswp _aswr _aswu _asw_ _asx2\"]")).click();
	

	}

}

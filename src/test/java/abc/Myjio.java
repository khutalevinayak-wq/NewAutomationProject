package abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myjio {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/login/");
		driver.manage().window().maximize();
		driver.findElement(By.className("j-text")).click();
		driver.findElement(By.id("inputField")).sendKeys("9763009944");
		driver.findElement(By.className("SubmitNumbers_buttonAndErrorContainer__30AoU")).click();
//		driver.findElement(By.linkText("Submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Submit")).click();
		driver.findElement(By.xpath("//button[@class=\"j-button j-button-size__large primary\"]")).click();
		
		
		
		
	}

}

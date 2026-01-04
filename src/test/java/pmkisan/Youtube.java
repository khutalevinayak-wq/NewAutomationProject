package pmkisan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@18.6004431,73.7574442,14012m/data=!3m1!1e3?entry=ttu&g_ep=EgoyMDI1MTIwOS4wIKXMDSoASAFQAw%3D%3D");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Ram mandir");
		
		
	
	}

}

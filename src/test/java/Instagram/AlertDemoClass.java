package Instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		//driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");  // Open Insta.         username
       driver.get("https://www.qaplayground.com/practice/alert");  // Open Insta.         username

		driver.manage().window().maximize();  // size max 
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]")).click();
		
		
		Alert a= driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		a.sendKeys("asdffgjjvfv");
		Thread.sleep(5000);
		
		a.accept();
		
	//	String ab=a.getText();
		
	//	a.accept();
		//a.dismiss();
		
		//System.out.println(ab);
	//	System.out.println(ab);
		System.out.println("passed");
		
	}
	

}

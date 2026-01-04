package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewAlerts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testautomationstudio.com/demo/misc/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("dialog1")).click();
		
		Actions as = new Actions(driver);
        Alert a=driver.switchTo().alert();   // handel alert
        
        
   
        
        String ab=a.getText();  // alert notification display
        System.out.println(ab);  // print alert notification
        
        a.accept();    // alert ok
  //      a.dismiss()   alert cancel 
       
        
		
		
		
		System.out.println("pass");
		
		
	}

}

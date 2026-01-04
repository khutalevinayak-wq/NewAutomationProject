package globalsQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		// Get the list of all links
		
		List<WebElement> link = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
		// Using for loop to display the text of all the links
		
		for(WebElement element:link)
		{
		System.out.println(element.getText());
		}
		// Click on the first link
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div/h3/a")).click();
		}
		
		

	

}

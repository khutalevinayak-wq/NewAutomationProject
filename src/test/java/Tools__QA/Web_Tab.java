package Tools__QA;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Web_Tab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)");  
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Baga  0001");
		driver.findElement(By.id("lastName")).sendKeys("NatuKaka");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys("BagaNAtukaka1234@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("age")).sendKeys("99");
		driver.findElement(By.id("salary")).sendKeys("50000000000");
		Thread.sleep(2000);
		
		driver.findElement(By.id("department")).sendKeys("Gada Electronic");
		Thread.sleep(2000);
		
	driver.findElement(By.id("submit")).click();
	Thread.sleep(3000);
		
		
		
		
		
	
	
	driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("firstName")).sendKeys("JETHALALA 0002");
	driver.findElement(By.id("lastName")).sendKeys("NatuKaka1");
	Thread.sleep(2000);
	
	driver.findElement(By.id("userEmail")).sendKeys("BagaNAtukaka1234@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("age")).sendKeys("99");
	driver.findElement(By.id("salary")).sendKeys("50000000000");
	Thread.sleep(2000);
	
	driver.findElement(By.id("department")).sendKeys("Gada Electronic");
	Thread.sleep(2000);
	
driver.findElement(By.id("submit")).click();
Thread.sleep(3000);
	
	
		
driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
Thread.sleep(2000);

driver.findElement(By.id("firstName")).sendKeys("Baga  0003");
driver.findElement(By.id("lastName")).sendKeys("NatuKaka");
Thread.sleep(2000);

driver.findElement(By.id("userEmail")).sendKeys("BagaNAtukaka1234@gmail.com");
Thread.sleep(2000);

driver.findElement(By.id("age")).sendKeys("99");
driver.findElement(By.id("salary")).sendKeys("50000000000");
Thread.sleep(2000);

driver.findElement(By.id("department")).sendKeys("Gada Electronic");
Thread.sleep(2000);

driver.findElement(By.id("submit")).click();
Thread.sleep(3000);


driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
Thread.sleep(2000);

driver.findElement(By.id("firstName")).sendKeys("Baga  0004");
driver.findElement(By.id("lastName")).sendKeys("NatuKaka");
Thread.sleep(2000);

driver.findElement(By.id("userEmail")).sendKeys("BagaNAtukaka1234@gmail.com");
Thread.sleep(2000);

driver.findElement(By.id("age")).sendKeys("99");
driver.findElement(By.id("salary")).sendKeys("50000000000");
Thread.sleep(2000);

driver.findElement(By.id("department")).sendKeys("Gada Electronic");
Thread.sleep(2000);

driver.findElement(By.id("submit")).click();
Thread.sleep(3000);


driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
Thread.sleep(2000);

driver.findElement(By.id("firstName")).sendKeys("Baga   0005");
driver.findElement(By.id("lastName")).sendKeys("NatuKaka");
Thread.sleep(2000);

driver.findElement(By.id("userEmail")).sendKeys("BagaNAtukaka1234@gmail.com");
Thread.sleep(2000);

driver.findElement(By.id("age")).sendKeys("99");
driver.findElement(By.id("salary")).sendKeys("50000000000");
Thread.sleep(2000);

driver.findElement(By.id("department")).sendKeys("Gada Electronic");
Thread.sleep(2000);

driver.findElement(By.id("submit")).click();
Thread.sleep(3000);


driver.close();


		
	}

}	
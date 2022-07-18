package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window

		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button

		driver.findElement(By.linkText("Create New Account")).click();
		
		// Step 7: Enter the first name

		driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg')]")).sendKeys("Ganesh Kumar");
				
		// Step 8: Enter the last name

		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("S");
		
		// Step 9: Enter the mobile number
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8754073979");
	   
		// Step 10: Enterthe password
 
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("temp@123");
		
		// Step 11: Handle all the three drop downs
 
		
		//Find the first dropdown
		 
		 WebElement dropdown1 = driver.findElement(By.id("day"));
		 
	   //Convert to Select Class;
		 
		 Select select1 = new Select(dropdown1);
		 
	   //Select by Visible
		 
		 select1.selectByVisibleText("18");	
		 
		 WebElement dropdown2 = driver.findElement(By.id("month"));
		 
		 Select select2 = new Select(dropdown2);
		 
		 select2.selectByVisibleText("Sep");
		 
		 WebElement dropdown3 = driver.findElement(By.id("year"));
		 
		 Select select3 = new Select(dropdown3);
		 
		 select3.selectByVisibleText("1995");
	
		// Step 12: Select the radio button "Female" 
		 
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
	
		 //Click on Submit
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
	}

}

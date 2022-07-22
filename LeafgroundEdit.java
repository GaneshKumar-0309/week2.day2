package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	//maximize
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// Load the URL http://leafground.com/pages/Edit.html
	
	driver.get("http://leafground.com/pages/Edit.html");
	
	// Enter email
	
	driver.findElement(By.id("email")).sendKeys("reachganesh95@gmail.com");
	
	Thread.sleep(4000);
	
	//Append a text and press keyboard tab
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("TextAdded");
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
	
	//Get default text entered
	
	System.out.println(driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value"));
	
	Thread.sleep(4000);
	//Clear the text
	
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	
	//Confirm that edit field is disabled

	System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
	
	}

}

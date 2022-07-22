package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Load the URL http://www.leafground.com/pages/Dropdown.html

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//maximize

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select training program using Index
	
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		
		Select select1 = new Select(dropDown1);
		
		select1.selectByIndex(1);

		// Select training program using Text
		
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		
		Select select2 = new Select(dropDown2);
		
		select2.selectByVisibleText("Selenium");

		// Select training program using Value
				
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		
		Select select3 = new Select(dropDown3);
		
		select3.selectByValue("3");

		// Get the number of dropdown options
		
		int dropdownCount = driver.findElements(By.xpath("//select[@class='dropdown']/option")).size()-1;
		
		System.out.println("The Number of options in this dropdown is "  + dropdownCount);
		
		Thread.sleep(3000);

		//Select your programs
		    
		driver.findElement(By.xpath("(//option[@value='1'])[6]")).click();
	}

}

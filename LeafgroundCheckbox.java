package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Load the URL http://leafground.com/pages/checkbox.html

		driver.get("http://leafground.com/pages/checkbox.html");

		//maximize

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Select the languages that you know?

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();

		// Confirm Selenium is checked

		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());


		// DeSelect only checked

		if (driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected()) {

			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();

		}


		// Select all below checkboxes

		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();

	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundLink {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL http://leafground.com/pages/Link.html
		
		driver.get("http://leafground.com/pages/Link.html");
		
		//maximize
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Go to Home Page

		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(3000);
		
		//Back to the links page
		
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		//Find where the link is  supposed to go without clicking 
		
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		
		System.out.println("The link is supposed to go to "+attribute);
		
		//Verify am I broken?
     
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		String title = driver.getTitle();
		
		if (title.contains("404 Not Found")) {
		
			System.out.println("The link is broken");
		
		} else {
		
			System.out.println("The link is not broken");

		}
		
		// Load the URL http://leafground.com/pages/Link.html
		
		driver.get("http://leafground.com/pages/Link.html");
		
		
		//Go to Home Page (Interact with same link name)
		
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		
		//Back to the links page
		
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		//How many links are available in this page?

		
		int links = driver.findElements(By.tagName("a")).size();
		
		System.out.println("Number of links in this page is :  " + links);
		
	}

}

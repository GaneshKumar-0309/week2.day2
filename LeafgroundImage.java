package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Load the URL http://leafground.com/pages/Image.html
		
		driver.get("http://leafground.com/pages/Image.html");
		
		Thread.sleep(3000);
		
		//Click on this image to go home page

		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		Thread.sleep(3000);
		
		//Going back to the image page
		
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[4]")).click();
		
		Thread.sleep(3000);
		
		//Am I Broken Image?
		
		
		//Click me using Keyboard or Mouse

		
		

	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL http://leafground.com/pages/Button.html
		
		driver.get("http://leafground.com/pages/Button.html");
		
		//maximize
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		
		// Click button to travel home page
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		//Back gain to the buttons page
		
		driver.findElement(By.xpath("//h5[text()='Button']/parent::a")).click();

		// Find the position of button (x,y)
		
		System.out.println("Position of the button is " + driver.findElement(By.id("position")).getLocation());

		// Find the button color
				
		String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
				
		System.out.println("Color of the Button is " + buttonColor);

		// Find the height and width
		
		System.out.println("Height and Width of the button is " + driver.findElement(By.id("size")).getSize());

	}

}

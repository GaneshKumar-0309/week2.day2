package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundTable {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL http://www.leafground.com/pages/table.html
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		//maximize
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Get the count of number of columns
				
		int columnCount = driver.findElements(By.xpath("(//tr)[2]/td")).size();
				
		System.out.println("Number of Columns " + columnCount);

		// Get the count of number of rows
		
		int rowCount = driver.findElements(By.tagName("tr")).size();
		
		System.out.println("Number of Rows  " + rowCount);

		// Get the progress value of 'Learn to interact with Elements'
		
		String text1 = driver.findElement(By.xpath("(//tr[@class='even']//font)[2]")).getText();		
		
		System.out.println("The progress of 'Learn to interact with Elements' is : "+text1);

		String text2 = driver.findElement(By.xpath("(//tr[@class='even']//font)[4]")).getText();		
		
		System.out.println("The progress of 'Learn to interact with Elements' is : "+text2);

		String text3 = driver.findElement(By.xpath("(//tr[@class='even']//font)[6]")).getText();		
		
		System.out.println("The progress of 'Learn to interact with Elements' is : "+text3);
		
		// Check the vital task for the least completed progress.
		
		WebElement checkBox = driver.findElement(By.xpath("((//td[1]/font)/following::font[1])[5]/following::input"));
		
		checkBox.click();
		
		System.out.println(checkBox.isSelected());
	}

}

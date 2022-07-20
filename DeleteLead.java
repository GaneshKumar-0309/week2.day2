package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// 1 Launch the browser
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 2	Enter the username
		 
		//input[@id='username']
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		
		// 3	Enter the password
		      
		//input[@id='password'] 
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		// 4	Click Login
		
		//input[@class='decorativeSubmit'] 
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// 5	Click crm/sfa link
		
		//a[contains(text(),'CRM/SFA')]
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		// 6	Click Leads link
		
		//a[text()='Leads']
		
		driver.findElement(By.linkText("Leads")).click();
		
		// 7	Click Find leads
		
		//a[text()='Find Leads']
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Click on Phone
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//		9	Enter phone number

		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("8754073979");
		
		//10	Click find leads button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//11	Capture lead ID of First Resulting lead
		
		String leadid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
		
		System.out.println("The first resulting lead is : "+leadid);
		
		// 12 Click on first resulting lead
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
				
		//13	Click Delete
		
		driver.findElement(By.linkText("Delete")).click();
		
		//14	Click Find leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//15	Enter captured lead ID
		
		//label[text()='Lead ID:']/following::input
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadid);
		
		//16	Click find leads button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 if(text2.contains("No records")) {
			 System.out.println("Successfully deleted");
		 }
		 else {
			 System.out.println("Unsuccessful");
		
		
		
		//16 Close the browser (Do not log out)
		
		
		//driver.close();
  

	}

}
}

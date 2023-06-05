package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Adactin_task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class"
				+ "/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/SearchHotel.php");
				
		driver.manage().window().maximize();
		

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("RakeshRockky");
		
		WebElement password = driver.findElement(By.xpath("//input[@type=\'password\']"));
		password.sendKeys("Rakesh@666606");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();		
		Thread.sleep(1000);

		
		WebElement new_york = driver.findElement(By.xpath("//option[@value='New York']"));
		new_york.click();
		
		Thread.sleep(1000);

		WebElement hotel = driver.findElement(By.xpath("//option[@value='Hotel Creek']"));
		hotel.click();
		
		Thread.sleep(1000);

		WebElement Room = driver.findElement(By.xpath("//option[@value='Super Deluxe']"));
		Room.click();
		Thread.sleep(1000);

		WebElement room = driver.findElement(By.xpath("//option[@value=\'2']"));
		room.click();
		Thread.sleep(1000);

		
		WebElement checkin = driver.findElement(By.xpath("//input[@value='17/05/2023']"));
		checkin.click();
		Thread.sleep(1000);

		
		WebElement checkout = driver.findElement(By.xpath("//input[@value='18/05/2023']"));
		checkout.click();
		Thread.sleep(1000);

		
		WebElement adult_room = driver.findElement(By.xpath("//option[@value='1']"));
		adult_room.click();
		Thread.sleep(1000);

		
		WebElement children_room = driver.findElement(By.xpath("//option[@value='0']"));
		children_room.click();
		Thread.sleep(1000);

		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		Thread.sleep(1000);

		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));	
		radiobutton.click();
		Thread.sleep(1000);

		
		WebElement continue_button = driver.findElement(By.xpath("//input[@type='submit']"));		
		continue_button.click();
		Thread.sleep(1000);

		
		WebElement first_Name = driver.findElement(By.xpath("//input[@name='first_name']"));
		first_Name.sendKeys("Rakesh");
		Thread.sleep(1000);

		
		WebElement last_Name = driver.findElement(By.xpath("//input[@name='last_name']"));
		last_Name.sendKeys("Rockky");
		Thread.sleep(1000);

		
		 WebElement Billing_adddress = driver.findElement(By.xpath("//textarea[@name='address']"));		 
		Billing_adddress.sendKeys("no13,nehru street,Anna nagar,chennai 600032");
		Thread.sleep(1000);

		
		WebElement card_no = driver.findElement(By.xpath("//input[@name='cc_num']"));	
		card_no.sendKeys("1938648999471314");	
		Thread.sleep(1000);

		
		WebElement card_type = driver.findElement(By.xpath("//option[@value='AMEX']"));	
		card_type.click();
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//option[@value='12']"));
		month.click();
		
		WebElement year = driver.findElement(By.xpath("//option[@value='2026']"));
		year.click();		
		Thread.sleep(1000);
		
		WebElement CVV = driver.findElement(By.xpath("//input[@maxlength='4']"));
		CVV.sendKeys("123");
		
		Thread.sleep(1000);
		
		WebElement book_now = driver.findElement(By.xpath("//input[@type='button']"));
		book_now.click();
	}

}

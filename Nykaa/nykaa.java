package Nykaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Action_class.newtab;

public class nykaa {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/IPT_Selenium_class/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_"
				+ "medium=search&utm_campaign=Search_Nykaa&gclid=CjwKCAjwvJyjBhApEiwAWz2nLbUGy"
				+ "3YBmc4ZLQ-h1UL67-ojP15uaDfF6mW-5hoMQ9opjDlf0FhfxxoCTfgQAvD_BwE");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Actions a = new Actions(driver);

		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		a.clickAndHold(skin).perform();
		

		WebElement Moisturizers = driver.findElement(By.xpath("(//a[text()='Moisturizers'])[1]"));
		Moisturizers.click();
		
		String title = driver.getTitle();
		System.out.println(title);


		for (String allwindow : driver.getWindowHandles())
		{
			driver.switchTo().window(allwindow);
		}
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	

		WebElement nivea = driver.findElement(By.xpath("//div[text()='NIVEA Soft "
				+ "Light Moisturizer for Face, Hand & Body, Non-Stic...']"));
		nivea.click();

		
		for (String allwindow : driver.getWindowHandles())
		{
			driver.switchTo().window(allwindow);
		}
		
		
		WebElement add_to_bag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		add_to_bag.click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		WebElement add_cart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		add_cart.click();

		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));	
		driver.switchTo().frame(frame1);
		
		
		WebElement proceed = driver.findElement(By.xpath("//button[text()='Login / Register']"));
		proceed.click();
		String title3 = driver.getTitle();
		System.out.println(title3);
	
		WebElement click_Mobile_number = driver.findElement(By.xpath("//input[@class='input text-center login-input']"));
		click_Mobile_number.click();
		
		WebElement enter_number = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		enter_number.sendKeys("9566660679");
		
		WebElement proceed_1 = driver.findElement(By.xpath("//button[text()='proceed']"));
		proceed_1.click();
				
		WebElement otp = driver.findElement(By.xpath("//input[@name='otpValue']"));
		otp.click();
		Thread.sleep(20000);

		
		WebElement verify = driver.findElement(By.xpath("//button[@type='submit']"));
		verify.click();
		String title4 = driver.getTitle();
		System.out.println(title4);

		
		WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		button.click();

		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(frame2);

		
		WebElement proceed3 = driver.findElement(By.xpath("//span[text()='Proceed']"));
		proceed3.click();
		Thread.sleep(3000);

		
		WebElement address = driver.findElement(By.xpath("//div[@class='css-1pan5g8 e1gecm6x0']"));		
		address.click();
		Thread.sleep(3000);

		
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		pincode.sendKeys("600032");
		
		
		
		
	}

}

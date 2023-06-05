package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Tittle of the page:"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Get current URL:"+currentUrl);
		
		
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("rakesh2@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("login password");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		driver.navigate().to("https://www.swiggy.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		
		
		
	}
}

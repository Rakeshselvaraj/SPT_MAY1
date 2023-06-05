package Java_Script;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/Users/rakeshs/eclipse-"
			+ "workspace/selenium_class/driver/chromedriver" );	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_"
			+ "cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_"
			+ "SOK&gclid=CjwKCAjw04yjBhApEiwAJcvNodWajxbkd_"
			+ "SwyeonOFggiR62RVSYBqEuXQY0QvIVifvxZ37KXJTkPBoCI7YQAvD_BwE");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	js.executeScript("window.scrollBy(0,3000)");
	
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-3000)");
	
	WebElement her = driver.findElement(By.xpath("//h4[text()='TRENDS FOR HER']"));
	js.executeScript("arguments[0].scrollIntoView();",her);
	
	
		
		
	}
	

}

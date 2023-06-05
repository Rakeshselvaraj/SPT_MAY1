package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_Mouse_action1 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				
		driver.manage().window().maximize();
		
		
        WebElement drag = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		
        Thread.sleep(3000);
		
		WebElement drop = driver.findElement(By.id("trash"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(drag).moveToElement(drop).perform(); 
		
		
		
		
		

}
	}

package Action_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_Mouse_action {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver","/Users/rakeshs/eclipse-workspace"
			+ "/selenium_class/driver/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://demoqa.com/droppable/");
//	driver.manage().window().maximize();
//	
//	WebElement drag = driver.findElement(By.id("draggable"));
//	WebElement drop = driver.findElement(By.id("droppable"));
//	
	Actions a = new Actions(driver);
//	
////	Thread.sleep(1000);
//
//	a.dragAndDrop(drag, drop).perform();
//	
//	
//	
//	Thread.sleep(3000);
//	
//	//================// =========================//===============
//	
//	
//	
//	WebElement drag1= driver.findElement(By.id("draggable"));
//	WebElement drop1 = driver.findElement(By.id("simpleDropContainer"));
//	
////	Thread.sleep(1000);
//	
//	a.clickAndHold(drag).moveToElement(drop1).perform();
//	
//	WebElement accept = driver.findElement(By.id("droppableExample-tab-accept"));
//
//	a.moveToElement(accept).perform();
a.contextClick().perform();
//	
//	System.out.println("wait...");
//	
//
//
//		
Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);	
	
	
	System.out.println("down done");
	
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_T);		
	r.keyRelease(KeyEvent.VK_T);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	//driver.switchTo().window();
	System.out.println("done");
		
	}

}

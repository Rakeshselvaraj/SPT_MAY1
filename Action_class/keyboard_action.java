package Action_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class" + "/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.manage().window().maximize();

		WebElement sell = driver.findElement(By.xpath("(//a[@tabindex='0'])[6]"));
		Thread.sleep(1000);

		Actions a = new Actions(driver);

		a.contextClick(sell).build().perform();

		Thread.sleep(7000);

		Robot r = new Robot();
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}

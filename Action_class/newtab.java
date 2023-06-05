package Action_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class newtab {

	static WebDriver driver;

	public static void tab() throws AWTException

	{

		System.setProperty("webdriver.chrome.driver","/Users/rakeshs/eclipse-"
				+ "workspace/selenium_class/driver/chromedriver");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.nykaa.com");
		driver.findElement(By.xpath("//a[@class='logo css-1bk0o9p']")).click();

		WebElement nat = driver.findElement(By.xpath("(//a[text()='Natural'])[1])"));

		Actions actions = new Actions(driver);
		actions.contextClick(nat).perform();
		

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);		
		

	}

	public static void main(String[] args) throws AWTException {

		tab();
	}

}

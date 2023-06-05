package Web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/rakeshs/eclipse-"
				+ "workspace/selenium_class/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> all = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td[1]"));

		for (WebElement web : all) {
			
			String text = web.getText();
			
			System.out.println(text);
			
		}
	
		
	}

}

package Screen_Shots_package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_screenshot {

	public static void facebook() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver; // Object

		File src = ts.getScreenshotAs(OutputType.FILE); // screenshot

		File des = new File("/Users/rakeshs/eclipse-workspace/selenium_class/Screenshot/facebook.png"); // location

		FileUtils.copyFile(src, des); //copy store 
		
	}

	public static void main(String[] args) throws IOException {
		facebook();

	}
}

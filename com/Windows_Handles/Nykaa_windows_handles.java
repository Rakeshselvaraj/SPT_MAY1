package com.Windows_Handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_windows_handles {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class" + "/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		
		Actions a = new Actions(driver);
		
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));		
		skin.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String str : windowHandles) 
		{
			String title0 = driver.switchTo().window(str).getTitle();
			System.out.println(title0);
		}
		
		
		
		
		WebElement skincare = driver.findElement(By.xpath("(//div[@class='outline-wrapper'])[1]"));
		skincare.click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		WebElement Bath = driver.findElement(By.xpath("(//a[text()='Bath & Body'])[1]"));
		Bath.click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		for (String str : windowHandles1) 
		{
			String title3 = driver.switchTo().window(str).getTitle();
			System.out.println(title3);
		}
		
		WebElement bodywash = driver.findElement(By.xpath("//div[text()='Pears Naturale Pomegranate Body Wash']"));
		bodywash.click();
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		
	}
}

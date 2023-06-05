package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_dropDown {

		public static void facebook()  {

			System.setProperty("webdriver.chrome.driver",
					"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");

			WebDriver driver = new ChromeDriver();

			driver.get("https://en-gb.facebook.com/reg/");

			driver.manage().window().maximize();
			
			WebElement clickbutton = driver.findElement(By.xpath("//a[@role='button']"));
			
			clickbutton.click();
			

  }
}
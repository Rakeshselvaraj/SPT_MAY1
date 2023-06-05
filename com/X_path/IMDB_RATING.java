package com.X_path;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMDB_RATING {
	
public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver",
"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.imdb.com/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Goa");
	
	WebElement sclick = driver.findElement(By.xpath("(//button[@id='suggestion-search-button'])[1]"));
	sclick.click();	
	
	WebElement Goa_click = driver.findElement(By.xpath("(//a[@role='button'])[7]"));
	Goa_click.click();
	
	WebElement rating = driver.findElement(By.xpath("//a[@aria-label='View User Ratings']"));
	rating.click();
	
	WebElement print_rating = driver.findElement(By.xpath("//span[@class='sc-5931bdee-1 jUnWeS']"));
	String text = print_rating.getText();
	System.out.println(text);
	
	
	}

}

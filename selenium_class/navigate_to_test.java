package selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_to_test {
				
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/rakeshs/eclipse-workspace/selenium_class/driver/chromedriver");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_"
			+ "e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=8773052612058921743&hvqmt="
			+ "e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-10573980&hydadcr=14453_2154373");

	driver.get("https://www.youtube.com/");
	driver.get("https://www.flipkart.com/");
	
	driver.navigate().to("https://www.youtube.com/");
	driver.navigate().to("https://www.flipkart.com/");

	driver.get("https://www.youtube.com/");
 	driver.navigate().to("https://www.flipkart.com/");

	driver.get("https://www.flipkart.com/");
	driver.navigate().to("https://www.flipkart.com/");
	
 	driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos="
 			+ "&hvnetw=g&hvrand=8773052612058921743&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy"
 			+ "=9061929&hvtargid=kwd-10573980&hydadcr=14453_2154373");
 	
	
	}
}

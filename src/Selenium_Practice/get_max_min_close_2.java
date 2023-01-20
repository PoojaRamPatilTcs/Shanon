package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_max_min_close_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\POOJA NILESH\\Downloads\\Compressed\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/new/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

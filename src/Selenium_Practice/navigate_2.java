package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\POOJA NILESH\\Downloads\\Compressed\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
	}

}

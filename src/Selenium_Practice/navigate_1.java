package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver R=new ChromeDriver();
		R.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		R.navigate().to("https://www.amazon.com/");
		R.navigate().back();
		Thread.sleep(2000);
		R.navigate().forward();
		Thread.sleep(2000);
		R.navigate().refresh();
		Thread.sleep(2000);
		R.close();
		
	}

}

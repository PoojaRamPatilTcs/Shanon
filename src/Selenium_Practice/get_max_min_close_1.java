package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_max_min_close_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://www.google.com/");
		Thread.sleep(2000);
		P.manage().window().minimize();
		P.get("https://www.amazon.com/");
		Thread.sleep(5000);
		P.manage().window().maximize();
		P.close();
	}

}

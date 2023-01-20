package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_max_min_close_5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver shivay=new ChromeDriver();
		shivay.get("https://www.amazon.com/");
		Thread.sleep(3000);
		shivay.manage().window().minimize();
		shivay.get("https://www.amazon.com/blackfriday?ref_=nav_cs_gb");
		Thread.sleep(4000);
		shivay.manage().window().maximize();
		shivay.close();
		
	}

}

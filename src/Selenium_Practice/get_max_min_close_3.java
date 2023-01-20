package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_max_min_close_3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver S=new ChromeDriver();
		S.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		S.manage().window().maximize();
		S.get("https://www.selenium.dev/");
		S.manage().window().minimize();
		S.close();
			
	}

}

package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_max_min_close_4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Pooja=new ChromeDriver();
		Pooja.get("https://www.google.com/");
		Thread.sleep(2000);
		Pooja.manage().window().minimize();
		Pooja.get("https://meet.google.com/landing?lfhs=2");
		Pooja.manage().window().maximize();
		Thread.sleep(5000);
		Pooja.close();
	}

}

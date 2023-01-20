package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_method {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Pooja=new ChromeDriver();
		Pooja.get("https://www.google.com/");
		Thread.sleep(4000);
		Pooja.manage().window().maximize();
		Pooja.get("https://www.amazon.com/");
		Pooja.manage().window().minimize();
		Pooja.close();
	}
}

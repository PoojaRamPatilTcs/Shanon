package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Pooja=new ChromeDriver();
		Pooja.get("https://www.google.com/");
		Pooja.manage().window().maximize();
		Thread.sleep(3000);
		Pooja.get("https://www.amazon.com/");
		Thread.sleep(5000);
		Pooja.get("https://www.flipkart.com/");
		
	}

}

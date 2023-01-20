package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Shivay=new ChromeDriver();
		Shivay.get("https://www.flipkart.com/");
		Shivay.manage().window().maximize();
		Thread.sleep(2000);
		Shivay.close();
		
		
	}

}

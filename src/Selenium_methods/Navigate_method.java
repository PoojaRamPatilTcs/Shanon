package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Poo=new ChromeDriver();
		Poo.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		Poo.navigate().to("https://www.amazon.com/");
		//backword
		Poo.navigate().back();
		//forward
		Poo.navigate().forward();
		//refresh the browser
		Poo.navigate().refresh();	
	
	}

}

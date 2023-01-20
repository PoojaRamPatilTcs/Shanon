package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize_3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Ram=new ChromeDriver();
		Ram.get("https://www.youtube.com/");
		Dimension d=new Dimension(400, 500);
		Ram.manage().window().setSize(d);
		Thread.sleep(5000);
		Ram.close();
		
	
	}

}

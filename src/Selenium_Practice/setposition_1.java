package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Seeta=new ChromeDriver();
		Seeta.get("https://www.naukri.com/");
		Point p=new Point(200, 200);
		Seeta.manage().window().setPosition(p);
		Thread.sleep(3000);
		Seeta.close();
			
	}

}

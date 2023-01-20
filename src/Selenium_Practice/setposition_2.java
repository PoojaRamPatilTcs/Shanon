package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver S=new ChromeDriver();
		S.get("https://secure.icicidirect.com/customer/login");
		Point p=new Point(300, 200);
		S.manage().window().setPosition(p);
		Thread.sleep(4000);
		S.close();
	}

}

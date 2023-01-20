package Selenium_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_method {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver Pooja=new ChromeDriver();
			Pooja.get("https://www.amazon.com/");
			Point p=new Point(200, 300);
			Pooja.manage().window().setPosition(p);
			
		}			

}

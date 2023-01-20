package Scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		//use java sript executer
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) dr;
		//scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,3000);");
		//scroll up
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-1500);");
	}
}

package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		P.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		//username
		P.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		//password
		P.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	}

}

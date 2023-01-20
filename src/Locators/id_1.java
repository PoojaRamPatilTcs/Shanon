package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://kite.zerodha.com/");
		P.findElement(By.id("userid")).sendKeys("DPG458");
		P.findElement(By.id("password")).sendKeys("Amol@123");
		Thread.sleep(8000);
		//P.findElement(By.xpath)
		P.close();
	}
}

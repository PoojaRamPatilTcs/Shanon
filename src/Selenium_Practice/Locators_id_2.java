package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id_2 {
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver Pooja=new ChromeDriver();
			Pooja.get("https://www.google.com/");
			Thread.sleep(1000);
			Pooja.findElement(By.name("q")).sendKeys("Lata mangeshkar first song");
			Pooja.findElement(By.name("btnK")).click();
		}
}

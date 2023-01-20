package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://kite.zerodha.com/");
		//username
		P.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
		//password
		P.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@123");
		//Login
		P.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		//getTitle
		String A="Kite - Zerodha's fast and elegant flagship trading platform";
		String B=P.getTitle();
		if (A.equals(B)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}

}

package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Selenium_Practice.keys_1;

public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.guru99.com/test/delete_customer.php");
		P.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		P.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345",Keys.TAB.ENTER);
	    Alert A = P.switchTo().alert();
		String B = A.getText();
	    System.out.println(B);
	    A.accept();
		
		
		
		
		
		
	}

}

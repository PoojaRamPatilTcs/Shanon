package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_and_alert_division {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions C=new ChromeOptions();
		C.addArguments("--Disable-notifications");
		C.addArguments("Start maximize");
		WebDriver P=new ChromeDriver(C);
		P.get("https://www.irctc.co.in/nget/train-search");
		P.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		P.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		
		
		
		
		
		
	}

}

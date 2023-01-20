package Selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Drive=new ChromeDriver();
		Drive.get("https://www.google.com/");
		Drive.findElement(By.name("q")).sendKeys("ranbir kapoor");
		Thread.sleep(2000);
		Drive.get("https://www.amazon.com/");
	}

}

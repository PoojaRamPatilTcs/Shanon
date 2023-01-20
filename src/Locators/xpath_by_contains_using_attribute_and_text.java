package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains_using_attribute_and_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		P.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		P.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		P.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_attribute_and_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		P.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		P.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		P.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify user should navigate to homepage
		String expT="actiTIME - Login";
		String actT=P.getTitle();
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}

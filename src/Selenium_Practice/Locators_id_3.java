package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators_id_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://www.instagram.com/accounts/login/");
		P.findElement(By.name("username")).sendKeys("Poojapatil108");
		P.findElement(By.name("password")).sendKeys("insta@123");
		//P.findElement(By.class
		String A="Login.Instagram";
		String B=P.getTitle();
		if (A.equals(B)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}

package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver F=new ChromeDriver();
		F.get("https://portal.futurepay.com/login");
		Thread.sleep(4000);
		F.findElement(By.xpath("//input[@id='fpEmailInput']")).sendKeys("patilpooja10893@gmail.com",Keys.TAB,"Pooja@123",Keys.ENTER);
	
	}

}

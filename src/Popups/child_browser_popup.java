package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://www.flipkart.com/");
		P.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		P.manage().window().maximize();
		P.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		P.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
		P.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		Set<String> W = P.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		String child = al.get(0);
		P.switchTo().window(child);
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_PAGE_DOWN);
		R.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
		
		
	}

}

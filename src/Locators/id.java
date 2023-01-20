package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		//enter username
	    P.findElement(By.id("username")).sendKeys("admin");
	    //enter password
	    P.findElement(By.name("pwd")).sendKeys("manager");
	    //click on login button
	    //P.findElement(By.xpath("//div[text()='Login']")).click();
	    //getTitle
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

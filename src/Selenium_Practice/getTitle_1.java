package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver N=new ChromeDriver();
		N.get("https://www.google.com/");
		String A="Google";
		String B=N.getTitle();
		if (A.equals(B)) {
			System.out.println("Tc is Pass");
		}
		else {
			System.out.println("Tc is fail");
		}
			
	}

}

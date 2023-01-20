package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://www.naukri.com/");
		String expT="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		String actT=P.getTitle();
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}
}

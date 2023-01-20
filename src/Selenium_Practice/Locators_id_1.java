package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Pooja=new ChromeDriver();
		Pooja.get("https://portal.futurepay.com/login");
		//enter username
		Pooja.findElement(By.id("fpEmailInput")).sendKeys("Pooja@123");
		//enter password
		Pooja.findElement(By.id("fpPasswordInput")).sendKeys("futurepay123");
		//login to futurepay
		Pooja.findElement(By.className("btn btn-primary")).click();
		//getTitle
		String expT="FuturePay";
		String actT=Pooja.getTitle();
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}

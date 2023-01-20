package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id_4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Pooja=new ChromeDriver();
		Pooja.get("https://www.trivago.in/?__wr=21&tc=26&cip=91030227040912&cip_tc=12891-101-101_privacy_1669291332401000000&cip_ext_id=1669291332401000000&mfadid=adm");
		Pooja.findElement(By.id("check_email")).sendKeys("patilpooja10893@gmail.com");
		
	}
}

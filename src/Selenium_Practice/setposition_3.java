package Selenium_Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver D=new ChromeDriver();
		D.get("https://www.trivago.in/?__wr=21&tc=26&cip=91030227040912&cip_tc=12891-101-101_privacy_1669291332401000000&cip_ext_id=1669291332401000000&mfadid=adm");
		Point P=new Point(400, 500);
		D.manage().window().setPosition(P);
		Thread.sleep(6000);
		D.close();
		
	}

}


package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		Dimension d=new Dimension(300, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

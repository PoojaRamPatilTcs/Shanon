package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername")
	@Test
	public void main(String browsername) {
		WebDriver P=null;
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			P=new ChromeDriver();
			P.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if (browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\POOJA NILESH\\Downloads\\Compressed\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		P=new FirefoxDriver();
		}
		P.get("https://demo.actitime.com/login.do");
		Reporter.log("Succesful",true);
		
	}
}

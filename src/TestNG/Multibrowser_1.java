package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_1 {
	@Parameters("browsername")
	@Test
	public void m1(String browsername) {
		WebDriver dr=null;
		
		if (browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\POOJA NILESH\\Downloads\\Compressed\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		dr=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.opera.driver", "C:\\Users\\POOJA NILESH\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			dr=new OperaDriver();
			
		}
		dr.get("https://www.amazon.com/");
		Reporter.log("Succesful",true);
	}
}

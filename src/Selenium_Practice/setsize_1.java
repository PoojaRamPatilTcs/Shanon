package Selenium_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Ruhi=new ChromeDriver();
		Ruhi.get("https://www.google.com/search?q=lata+mangeshkar&source=hp&ei=cUl-Y_3NMO_Cz7sPqMaB0Ak&iflsig=AJiK0e8AAAAAY35XgYJOQAmNP3XkFP-7IDU1u45bRLtE&gs_ssp=eJzj4tTP1TcwTM8oyjFg9OLPSSxJVMhNzEtPLc7ITiwCAHyHCVo&oq=lata&gs_lcp=Cgdnd3Mtd2l6EAEYADIICC4QsQMQgAQyCAgAEIAEELEDMgUIABCABDIICAAQgAQQsQMyBQguEIAEMgsILhCABBDHARCvATIRCC4QgAQQsQMQgwEQxwEQ0QMyBQgAEIAEMgUIABCABDILCC4QgAQQsQMQgwE6CggAEOoCELQCEEM6CgguEOoCELQCEEM6FAgAEOoCELQCEIoDELcDENQDEOUCOgUIABCxAzoLCAAQgAQQsQMQgwE6CAgAELEDEIMBOhEILhCDARDHARCxAxDRAxCABDoOCC4QgAQQsQMQxwEQ0QM6CAguEIAEENQCOggILhCABBCxAzoLCC4QgAQQsQMQ1AJQnSVYgilgyz1oAnAAeACAAboBiAG5BZIBAzAuNJgBAKABAbABCg&sclient=gws-wiz");
		Dimension d=new Dimension(500, 300);
		Ruhi.manage().window().setSize(d);
		Thread.sleep(3000);
		Ruhi.close();
			
	}

}

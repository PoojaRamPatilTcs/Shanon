package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\POOJA NILESH\\Downloads\\Compressed\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		 WebDriver Driver=new FirefoxDriver();
		 Driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 Driver.manage().window().maximize();
		 Driver.get("https://www.flipkart.com/india-ka-furniture-studio-store?fm=neo%2Fmerchandising&iid=M_c205d634-15e3-4527-94dc-67a0368f8908_1_372UD5BXDFYS_MC.Q6I8NGK1VUG9&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Home~Home%2BFurnishings_Q6I8NGK1VUG9&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=Q6I8NGK1VUG9");
		 
		 
	}

}

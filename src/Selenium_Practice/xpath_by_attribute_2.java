package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute_2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver K=new ChromeDriver();
		K.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		Dimension d=new Dimension(300, 400);
		K.manage().window().setSize(d);
		Thread.sleep(3000);
		K.navigate().to("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		K.manage().window().maximize();
		K.navigate().forward();
		//name
		K.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Seeta Patil");
		//mobile number
		K.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8668462440");
		//email address
		K.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("seetarampatil1973@gmail.com");
		//password
		K.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon@123");
		//submit button
		K.findElement(By.xpath("//input[@id='continue']")).click();
	 	String a="Authentication required";
	 	String b=K.getTitle();
	 	if (a.equals(b)) {
			System.out.println("TC is pass");
		}
	 	else {
			System.out.println("TC is fail");
		}
	    K.close();	
	}
		
}

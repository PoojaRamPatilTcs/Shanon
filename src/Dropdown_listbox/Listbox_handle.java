package Dropdown_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
	P.get("https://www.facebook.com/");
	P.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
	//select day list box
	WebElement day = P.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Select d=new Select(day);
	//use select class
	d.selectByValue("10");
	//select month list box
		WebElement month = P.findElement(By.xpath("//select[@id='month']"));
		//create object of select class
		Select m=new Select(month);
		Thread.sleep(4000);
		//use select class
		m.selectByValue("8");
		WebElement year = P.findElement(By.xpath("//select[@id='year']"));
		//create object of select class
		Select y=new Select(year);
		Thread.sleep(4000);
		//use select class
		y.selectByValue("1993");	
	
	
	
	}
}
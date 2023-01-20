package Keys_and_Robot_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA NILESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver P=new ChromeDriver();
		P.get("https://demo.actitime.com/login.do");
		/*P.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		P.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		P.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//open application by using keys class
		P.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		*/
	}

}

package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel {
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://www.facebook.com/"); 
	Select slt=new Select(driver.findElement(By.id("day")));//if dropdown list is made with select tag, then only this is used
	slt.selectByValue("12");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sel s=new sel();
s.launch();
	}

}

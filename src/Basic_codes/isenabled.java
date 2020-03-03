package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://spicejet.com/default.aspx"); 
	WebElement dept=driver.findElement(By.id("ct100_mainContent_view_date2"));
	if(dept.isEnabled())
	{
		System.out.println("Enabled");
	}else
	{
		System.out.println("Disabled");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
isenabled oo=new isenabled();
oo.launch();
	}

}

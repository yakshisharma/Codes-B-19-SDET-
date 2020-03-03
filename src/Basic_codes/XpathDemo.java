package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	String path;
	public void bytagnamedemo()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("www.facebook.com");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
//		driver.findElement(By.xpath("//a[text()='Terms')]")).click();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
XpathDemo oo=new XpathDemo();
oo.bytagnamedemo();
	}

}

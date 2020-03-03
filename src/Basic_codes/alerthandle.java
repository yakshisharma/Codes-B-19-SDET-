package Basic_codes;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {
	public void launch() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Alert alt=driver.switchTo().alert();
	Thread.sleep(5000);
	System.out.println(alt.getText());
	alt.accept();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
alerthandle obj=new alerthandle();
obj.launch();
	}

}

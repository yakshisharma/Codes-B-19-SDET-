package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
WebDriver driver= new ChromeDriver();//w
		driver.get("http://172.16.10.77/hrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).submit();
		//driver.switchTo().frame(0);
		driver.switchTo().frame("rightMenu");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr[2]/td[1]/input")).click();
	}

}


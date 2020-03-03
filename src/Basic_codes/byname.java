package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class byname {
public void launch()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement uname= driver.findElement(By.name("email"));
			System.out.println(uname.getSize());
			System.out.println(uname.getLocation());
			if(uname.isDisplayed())
			{
			uname.sendKeys("yakshisharma91@yahoo.com");//by ID locator
			}
			WebElement pass=driver.findElement(By.name("pass"));
				if(pass.isDisplayed())
				{
				pass.sendKeys("sweethome@1234");
				}
		
			driver.findElement(By.id("u_0_b")).submit();
			driver.manage().deleteAllCookies();

	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			byname oo=new byname();
			oo.launch();
}
}

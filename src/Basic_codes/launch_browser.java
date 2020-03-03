package Basic_codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class launch_browser {
	String title="www.google.com";
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		//driver.get("https://www.google.com");//driver is reference variable
		//driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");

		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contentEquals(title))
		{
			System.out.println("correct page");
		}
		else
		{
			System.out.println("you are not on correct page");
		}
		//driver.quit();
		driver.findElement(By.id("email")).sendKeys("yakshisharma91@yahoo.com");//by ID locator
		driver.findElement(By.id("pass")).sendKeys("sweethome@1234");
		driver.findElement(By.id("u_0_b")).submit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch_browser oo=new launch_browser();
oo.launch();

	}

}

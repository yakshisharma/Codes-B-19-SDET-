package Basic_codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class linktext {
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		driver.navigate().to("https://www.facebook.com");
		//driver.findElement(By.name("email")).sendKeys("yakshisharma91@yahoo.com");//by ID locator
		driver.findElement(By.partialLinkText("account")).click();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
linktext oo=new linktext();
oo.launch();
	}

}

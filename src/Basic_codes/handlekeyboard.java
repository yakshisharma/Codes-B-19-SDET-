package Basic_codes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlekeyboard {
	public void launch() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("Input Devices");
    Thread.sleep(5000);
    driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
handlekeyboard oo=new handlekeyboard();
oo.launch();
	}

}

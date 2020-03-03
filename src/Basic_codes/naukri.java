package Basic_codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class naukri {
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		driver.navigate().to("https://www.naukri.com/hr-recruiters-consultants");
		driver.findElement(By.name("qp")).sendKeys("Software Developer");
		driver.findElement(By.name("ql")).sendKeys("Chandigarh");
		driver.findElement(By.id("qsbFormBtn")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
naukri oo=new naukri();
oo.launch();
	}

}

package Basic_codes;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoopla {
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		driver.navigate().to("https://www.zoopla.co.uk/");
		driver.findElement(By.id("search-input-location")).sendKeys("London");
		driver.findElement(By.id("search-submit")).click();
		ArrayList <WebElement> ag= new ArrayList<WebElement>(driver.findElements(By.className("listing-results-price text-price")));
		for(int i=0;i<ag.size();i++)
		{
			System.out.println(ag.get(i).getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
zoopla oo=new zoopla();
oo.launch();
	}

}

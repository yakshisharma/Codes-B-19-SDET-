package Basic_codes;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipkart 
{
	int count;
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		driver.navigate().to("https://www.flipkart.com/search?q=Mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.className("_1vC4OE _2rQ-NK"));
		count=al.size();
		for(int i=0;i<count;i++)
		{
			System.out.println(al.get(i).getText());
		}
		}
public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
flipkart obj=new flipkart();
obj.launch();
	}
}

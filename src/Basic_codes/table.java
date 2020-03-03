package Basic_codes;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class table {
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.navigate().to("file:///F:/Program/HTML/table.html");
	ArrayList<WebElement> sa=new ArrayList<WebElement>(driver.findElements(By.xpath("//table//tr//th")));
	for(int i=0;i<sa.size();i++)
	{
		System.out.println(sa.get(i).getText());
	}
	ArrayList<WebElement> obj=new ArrayList<WebElement>(driver.findElements(By.xpath("//table//tr//td")));
	for(int i=0;i<obj.size();i++)
	{
		System.out.println(obj.get(i).getText());
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
table oo=new table();
oo.launch();
	}

}

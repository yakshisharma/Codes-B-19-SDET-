package Basic_codes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopup {
public void launch()
		{
			System.setProperty("webdriver.chrdriver.findElement(By.linkText(\"Good PopUp #1\")).click();ome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
			driver.get("https://company.naukri.com/popups/croma/17feb2020/index.html"); 
			driver.findElement(By.xpath("/html/body/a/img")).click();
			Set<String> sel =driver.getWindowHandles();
			Iterator<String> it= sel.iterator();
			String parentWindowId= it.next();
			System.out.println("ID of parent window:"+parentWindowId);
			String childWindowId= it.next();
			System.out.println("ID of child window:"+childWindowId);
			driver.switchTo().window(childWindowId);
			String title=driver.getTitle();
			System.out.println("Title of child window"+title);
			driver.close();
			
			driver.switchTo().window(parentWindowId);
			String titleWin=driver.getTitle();
			System.out.println("Title of Parent Window:"+titleWin);
			driver.close();

	}
public void launch1()
{
	System.setProperty("webdriver.chrdriver.findElement(By.linkText(\"Good PopUp #1\")).click();ome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://company.naukri.com/popups/techmahindra/2492019/index.html"); 
	driver.findElement(By.xpath("/html/body/a/img")).click();
	Set<String> sel =driver.getWindowHandles();
	Iterator<String> it= sel.iterator();
	String parentWindowId= it.next();
	System.out.println("ID of parent window:"+parentWindowId);
	String childWindowId= it.next();
	System.out.println("ID of child window:"+childWindowId);
	driver.switchTo().window(childWindowId);
	String title=driver.getTitle();
	System.out.println("Title of child window"+title);
	driver.close();
	
	driver.switchTo().window(parentWindowId);
	String titleWin=driver.getTitle();
	System.out.println("Title of Parent Window:"+titleWin);
	driver.close();

}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	NaukriPopup oo= new NaukriPopup();
	oo.launch();
	oo.launch1();
}
}

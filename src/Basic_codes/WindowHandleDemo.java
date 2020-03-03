package Basic_codes;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
		driver.get("http://www.popuptest.com//goodpopups.html"); 
		driver.findElement(By.linkText("Good PopUp #1")).click();
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
WindowHandleDemo oo= new WindowHandleDemo();
oo.Launch();
	}

}

package Basic_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//webdriver is inbuild interface
	driver.get("https://jqueryui.com/droppable/"); 
	driver.switchTo().frame(0);
	Actions act= new Actions(driver);
	act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Actiondemo oo=new Actiondemo();
oo.launch();
	}

}

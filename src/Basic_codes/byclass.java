package Basic_codes;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class byclass {
	String path;
	int count;
	public void checkbyclass()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		System.out.println(path);
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("www.facebook.com");
		ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.className("inputtext_55r1 inputtext_1kbt inputtext_1kbt"));
		count=al.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(al.get(i).getText());
		}
		
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
byclass oo=new byclass();
oo.checkbyclass();
	}

}

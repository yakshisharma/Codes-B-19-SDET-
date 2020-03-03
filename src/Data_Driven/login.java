package Data_Driven;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
	String uname,pass;
	public void fetch() throws IOException
	{
		FileInputStream fs=new FileInputStream("F:\\Program\\Java Programs\\src\\TestData\\login_details.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		XSSFRow row=sheet.getRow(0);
		int col=row.getLastCellNum()-1;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Program\\Java Programs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//webdriver is		WebDriver driver=new ChromeDriver(); 
				for(int i=1;i<=count;i++)
		{
		for(int j=0;j<col;j++)	
		{
			
			driver.navigate().to("https://www.facebook.com");
			uname=sheet.getRow(i).getCell(j).toString();
			pass=sheet.getRow(i).getCell(j+1).toString();
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(uname);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.id("u_0_b")).click();
			driver.navigate().back();

		}
		}
		}
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
login f=new login();
f.fetch();
	}

}

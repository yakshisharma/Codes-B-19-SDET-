package inheritance;
import java.util.Scanner;
public class studetail {
	int rollno;
	String name;
	Scanner sc= new Scanner(System.in);
public void accept()
{
	System.out.println("Enter roll no");
	rollno=sc.nextInt();
	System.out.println("Enter name");
	name=sc.next();

}
	public void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("Roll no:"+rollno);
	}

}

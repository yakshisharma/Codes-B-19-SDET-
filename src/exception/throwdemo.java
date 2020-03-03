package exception;
import java.util.Scanner;
public class throwdemo {
	int age;
	Scanner s=new Scanner(System.in);
public void accept() throws invalidage
{
	try {
		System.out.println("Enter age");
		age=s.nextInt();
		if(age<=18)
		{
			throw new invalidage();
		}
	} catch (invalidage e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Enter age not less than 18");
		age=s.nextInt();
	}
}
	public static void main(String[] args) throws invalidage {
		// TODO Auto-generated method stub
throwdemo oo=new throwdemo();
oo.accept();
	}
	

}

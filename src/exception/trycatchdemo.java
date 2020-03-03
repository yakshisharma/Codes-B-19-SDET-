package exception;
import java.util.Scanner;
public class trycatchdemo {
int dividend,divisor,res;
Scanner s=new Scanner(System.in);
public void calculate()
{
	try
	{
		System.out.println("Enter dividend");
		dividend=s.nextInt();
		System.out.println("Enter divisor");
		divisor=s.nextInt();
		
res= dividend/divisor;
System.out.println("Result is:"+res);
}
	catch(ArithmeticException e)
	{
		System.out.println("enter divisor again");
		divisor=s.nextInt();

		res=dividend/divisor;
		System.out.println("res:"+res);
	}
	finally
	{
		System.out.println("Bye bye 2019");
		s.close();
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
trycatchdemo oo=new trycatchdemo();
oo.calculate();
	}

}

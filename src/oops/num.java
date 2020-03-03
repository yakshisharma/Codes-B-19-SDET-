package oops;
import java.util.Scanner;
public class num {
int n1,n2,res;
Scanner s=new Scanner(System.in);
public void enter()
{
	System.out.println("Enter n1");
	n1=s.nextInt();
	System.out.println("Enter n2");
	n2=s.nextInt();

}
public void add()
{
	res=n1+n2;
	System.out.println("Addition:"+res);
}
public void sub()
{
	res=n1-n2;
	System.out.println("Subtraction:"+res);
}
public void mul()
{
	res=n1*n2;
	System.out.println("Multiplication:"+res);
}
public void div()
{
	res=n1/n2;
	System.out.println("Division:"+res);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
num n=new num();
n.enter();
n.add();
n.sub();
n.mul();
n.div();
	}

}

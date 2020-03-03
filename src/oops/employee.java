package oops;
import java.util.Scanner;
public class employee {
	int empid;
	float salary;
	String name;
	Scanner s=new Scanner(System.in);
	public void EnterDetails()
	{
System.out.println("Enter ID");
empid = s.nextInt();
System.out.println("Enter Name");
name = s.next();
System.out.println("Enter Salary");
salary = s.nextFloat();
	}
	public void display()
	{
		System.out.println("Emp ID:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee obj=new employee();
obj.EnterDetails();
obj.display();
	}

}

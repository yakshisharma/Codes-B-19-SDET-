package Abstraction;
import java.util.Scanner;
abstract class emp {
	Scanner s=new Scanner(System.in);
	int id, sal;
	String name;
	abstract void enter();
}
class dis extends emp
{

	@Override
	void enter() {
		// TODO Auto-generated method stub
		System.out.println("Enter salary");
		sal=s.nextInt();
	
	}
	void d()
	{
		System.out.println("Salary:"+sal);
	}
	
}
 class display extends emp
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display oo=new display();
		dis op=new dis();
		oo.enter();
		
		
		op.enter();
		oo.disp();
		op.d();
	}

	@Override
	void enter() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter ID");
		id=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		}
	 void disp()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
}

	



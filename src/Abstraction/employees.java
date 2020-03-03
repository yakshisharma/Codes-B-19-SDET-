package Abstraction;

public class employees extends cow implements employeedet,discount{
	int id;
	String name;
     public static void main(String[] args) {
		// TODO Auto-generated method stub
employees e=new employees();
e.ent();
e.dis();
discount.d();
e.acc();
e.drink();
e.eat();
	}

	@Override
	public void ent() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID:");
		id=s.nextInt();
		System.out.println("Enter name:");
		name=s.next();
	}

	@Override
	public void dis() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}

}

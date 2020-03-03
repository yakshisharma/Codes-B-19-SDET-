package Abstraction;

public class student extends cow implements studentdetails{
	int rollno;
	String name,course;
	double fee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
student oo= new student();
oo.perdet();
oo.coursedet();
oo.feedet();
oo.display();
oo.dis();
discount.d();
oo.acc();
	}

	@Override
	public void perdet() {
		// TODO Auto-generated method stub
		System.out.println("Enter roll no");
		rollno=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		eat();
			
		}

	@Override
	public void coursedet() {
		// TODO Auto-generated method stub
		System.out.println("Enter course name");
		course=s.next();
	}

	@Override
	public void feedet() {
		// TODO Auto-generated method stub
		System.out.println("Enter fee");
		fee=s.nextDouble();

	}
	public void display()
	{
		System.out.println("Roll no"+rollno);
		System.out.println("Name"+name);
		System.out.println("Course"+rollno);
		System.out.println("Fees"+fee);



	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("Discount for special students");
	}

}

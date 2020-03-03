package inheritance;

public class studet extends studetail{
	int eng,hindi,total;
	public void acc()
	{
		accept();
		super.rollno=12;
		System.out.println("Enter marks in english");
		eng=sc.nextInt();
		System.out.println("Enter marks in hindi");
		hindi=sc.nextInt();
		total=eng+hindi;
		System.out.println("Total:"+total);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
studet oo=new studet();
oo.acc();
	}

}

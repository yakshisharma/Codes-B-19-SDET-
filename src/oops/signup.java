package oops;

public class signup {
	public void insert()
	{
		studentdemo oo=new studentdemo();
		oo.setrollno(1);
		System.out.println(oo.getRoll());
		oo.SetName("Yakshi");
		System.out.println(oo.getName());
	}
	public static void main(String args[]) 
	{
		signup oo=new signup();
		oo.insert();
	}

}

package oops;

public class staticdemo {
	int rollno;
	String name;
	static String college="ITS";
	
	staticdemo(int r,String n)
	{
		rollno=r;
		name=n;
	}
   void display()
   {
	   System.out.println(rollno+" "+name+" "+college);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
staticdemo s1=new staticdemo(111,"Kartik");
staticdemo s2=new staticdemo(222,"Aryan");
s1.display();
s2.display();
	}

}

package oops;
import static java.lang.System.out;
public class staticmethod {
	static String companyname="btes";
	static String name;
	public static void disp()
	{
		out.println("Company name is:"+companyname);
		
	}
	static
	{
		name="Yogesh";
		out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
disp();
	}

}

package inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 oo= new A1();
oo.acc(10);
oo.acc(20.0);

	}
}
class B1
{
	public void acc(double i)
	{
		System.out.println(i*2);
	}
}
	class A1 extends B1
	{
		public void acc(int i)//Method overloading
		{
			System.out.println(i);
		}

	}



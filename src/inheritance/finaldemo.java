package inheritance;

public class finaldemo {
	final float pie=3.14f , r=12f;
	float area;
	public void acc()
	{
		area=pie*r*r;
		System.out.println("Area of circle="+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.acca();
		a.acc();

	}

}
class A extends finaldemo
{
	public void acca()
	{
	
		System.out.println(pie);
	}
}
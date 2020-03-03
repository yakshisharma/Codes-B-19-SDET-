package Abstraction;

public class deerclass extends abstractdemo  {
	void eat()
	{
		System.out.println("Deer eats non veg");
		drink();
		a=100;
		System.out.println(a);
	}
	void perdet()
	{
		System.out.println("Personal details");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
deerclass oo= new deerclass();
oo.perdet();
oo.eat();
	}

}

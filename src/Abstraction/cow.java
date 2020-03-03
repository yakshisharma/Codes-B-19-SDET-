package Abstraction;

public class cow extends abstractdemo{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cow c= new cow();
c.drink();
c.eat();
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cow eats grass");
		a=10;
		System.out.println(a);
	}

}

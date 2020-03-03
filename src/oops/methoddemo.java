package oops;

public class methoddemo {
	int sum, num1,num2;
	public void add(int num1,int num2)//taking something returning nothing
	{
		sum=num1+num2;
		System.out.println("Sum is:"+sum);
	}
	public int add1(int num1, int num2)//taking something returning something
	{
		sum=num1+num2;
		return sum;
	}
	public int add2()//taking nothing returning nothing
	{
		num1=20;
		num2=30;
		return sum=num1+num2;
	}
	public int add3() //taking nothing returning nothing
	{
				sum=num1+num2;
				return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methoddemo oo=new methoddemo();
oo.add(10, 20);
System.out.println(oo.add1(100, 200));
System.out.println(oo.add2());
System.out.println(oo.add3());
	}

}

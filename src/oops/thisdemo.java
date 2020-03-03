package oops;

public class thisdemo {
	int num=20;
	public thisdemo()
	{
		System.out.println("Constructor calling");
	}
	//public thisdemo(int num)
	//{
	//	this();
	//	this.num=num;
	//	System.out.println(num);
	//	System.out.println(this.num);

	//}
	public void acc(int num)
	{
	this.num=num;
	System.out.println(num);
	System.out.println(this.num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisdemo oo=new thisdemo();
		oo.acc(100);

	}

}

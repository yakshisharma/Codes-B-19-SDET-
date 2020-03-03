package Abstraction;

public interface discount {
	void dis();
	static void d()
	{
		System.out.println("Discount offer");
	}
	default void acc()
	{
		System.out.println("Calling default method");
	}
	

}

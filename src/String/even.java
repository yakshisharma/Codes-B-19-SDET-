package String;
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a1= new int[8];
int i;
Scanner s= new Scanner(System.in);
System.out.println("Enter the elements of array:");
for(i=0;i<8;i++)
{
a1[i]= 	s.nextInt();
}
System.out.println("Even elements are:");
for(i=0;i<8;i++)
{
if(a1[i]%2==0)
{
	System.out.println(a1[i]);
	
}
}
}
}
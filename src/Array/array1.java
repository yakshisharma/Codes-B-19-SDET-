package Array;
import java.util.Scanner;
public class array1 {
	public static void main(String[] ar)
	{
int i,j;
boolean test= false;
		int[] ar1 = {22,50,6,9,2};
		System.out.println("Enter the value u want to search");
		Scanner s= new Scanner(System.in);
		j=s.nextInt();   
		for(i=0;i<ar1.length;i++)
		{
			if(j==ar1[i])
			{
				test=true;
				break;
			}
		}
		if(test) 
		{
			System.out.println("No. is found at location:"+i);
		}
			else
			{
				System.out.println("No is not found");
			
			}
		}
	}


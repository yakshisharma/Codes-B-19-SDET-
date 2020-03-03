package String;

public class DuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,5,3,6,2,8,5,1};
int i,j;
System.out.println("Duplicate elements in an array are:");
for(i=0;i<arr.length;i++)
{
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.println(arr[j]);
	
			
		}
	}
}





	}

}

package Array;

public class bubblesort {

	public static void main(String[] args) {
	
		int temp;
		int[] arr={45,56,12,99,42};

		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("hello");
		for(int j=i+1;j<arr.length;j++)
		{
			//System.out.println("-----------------hello");
		if(arr[i]>arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		System.out.print(arr[i]+"\t");
		}
		
		
		// TODO Auto-generated method stub

	}

}

package Array;

public class dup {

	public static void main(String[] args) {
		int[] arr= {1,2,5,8,9,6,2,3,5,6};
		System.out.println("Duplicate elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}

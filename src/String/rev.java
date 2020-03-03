package String;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Yogesh Kumar",r="",r1="";
		String[] str1;
		str1= str.split(" ");
		for(int i=str1[0].length()-1;i>=0;i--)
		{
			r=r+str1[0].charAt(i);
			
		}
		for(int i=str1[1].length()-1;i>=0;i--)
		{
			r1=r1+str1[1].charAt(i);
			
		}
		System.out.println(r+" "+r1);

	}

}

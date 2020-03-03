package String;

public class palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="naman",rev="";
for(int i=name.length()-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
}
if(name.contentEquals(rev))
{
	System.out.println("Palindrome");
	
}
else
{
	System.out.println("Not Palindrome");

}

	}

}

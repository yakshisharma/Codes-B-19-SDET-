package String;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b= false;		
String str= "you are intelligent";
System.out.println("Index of vowels are:");
for(int i=0; i<str.length();++i)
{
char ch= str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
	b=true;
	System.out.println(i);
}

}
if(b)
{
	System.out.println("Vowels are present");
}
else
{
	System.out.println("Vowels are not present");
}
	}
}


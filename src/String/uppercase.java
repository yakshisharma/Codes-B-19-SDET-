package String;
import java.util.Scanner;
public class uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner s= new Scanner(System.in);
System.out.println("Enter any string");
str= s.nextLine();
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
	if(ch[i]>='a'&&ch[i]<='z')
	{
		ch[0]= (char)(ch[0]-'a'+'A');
		System.out.print(ch[i]);
	}
}

	}

}

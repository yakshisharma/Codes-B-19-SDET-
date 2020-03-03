package String;

public class firstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Shalini", rev="";
String name1="Pooja";
String[] str1;
System.out.println(name);
System.out.println(name1);
name=name.concat(name1);
System.out.println(name);
System.out.println(name.charAt(4));
for(int i=name.length()-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
	
}
System.out.println(rev);
String str="How are you";
System.out.println(str.toUpperCase());
System.out.println(str.substring(1, 3));
str1=str.split(" ");

System.out.println(str1[1]);
if(str.contains("How"))
{
	System.out.println("how is present");
}
else
{
	System.out.println("not present");

}

System.out.println(str.replace('o','a'));
int a=10,b=22;
char s='a';
String s1="is whole no";
System.out.println(a+b+s1+s);

	}

}

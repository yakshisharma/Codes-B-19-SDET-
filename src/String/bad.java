package String;

public class bad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="That guy is very stupid and nonsense";
String sd;
String[] str1 = {"stupid","foolish","nonsense","rascal"};
for(int i=0;i<str1.length;i++)
{
	sd=str1[i].toString();
if(str.contains(str1[i]))
{
	str=str.replace(str1[i],"*****");
}
	}
System.out.println(str);
	}
}

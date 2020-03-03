package String;

public class occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "What's the matter son, your school notebooks are still uncovered?";
int i, res=0;
for(i=0;i<str.length();i++)
{
	if(str.charAt(i)=='s')
	{
	res++;
	System.out.println("Index of s:"+(i+1));
	
	}
	
}

System.out.println("no of occurence:"+res);
	}

}

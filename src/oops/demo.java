package oops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo {
	int num;
	String name;
	public void input() throws IOException
	{
		InputStreamReader rd=new InputStreamReader(System.in);
		BufferedReader bd= new BufferedReader(rd);
		System.out.println("Enter name");
		name=bd.readLine();
		System.out.println(name);
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

demo oo=new demo();
oo.input();
	}

}

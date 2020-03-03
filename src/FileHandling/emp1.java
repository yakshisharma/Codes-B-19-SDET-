package FileHandling;
import java.util.Scanner;
import java.io.*;
public class emp1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw=	new FileWriter("F://Program//Agam.txt");

		int id;
		String name;
Scanner s=new Scanner(System.in);
System.out.println("Enter ID:");
id=s.nextInt();
System.out.println("Enter Name:");
name=s.next();
try
{
	fw.write(id+" "+name);
}
catch(Exception e)
{
	System.out.println("File not found");
}
finally
{
	fw.close();
}


	}

}

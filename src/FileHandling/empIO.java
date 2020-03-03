package FileHandling;
import java.io.*;
import java.util.Scanner;
public class empIO {
	Scanner s=new Scanner(System.in);
	int id;
	String name;

	public void read() throws IOException
	{
		
			System.out.println("Enter ID:");
			id=s.nextInt();
			System.out.println("Enter name:");
			name=s.next();
	}
	public void write() throws IOException
	{
BufferedWriter b=null;
		
		FileWriter fw=	new FileWriter("F://Program//Agam.txt");
		b=new BufferedWriter(fw);
		//fw.write(id);
		fw.write(id+" "+name);
		fw.close();
		b.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
empIO i=new empIO();
i.read();
i.write();
	}

}

package FileHandling;

import java.io.*;

public class filedemo {
	byte arr[]= {10,22,33};
	public void readdata() throws IOException
	{
		File f= new File("F://Program//Agam.txt");
		//File f= new File("F://Prog");

		FileInputStream fs= new FileInputStream(f);
		f.createNewFile();
		//f.mkdirs();
		
	}
	public void WriteData() throws IOException
	{
		FileOutputStream fo= new FileOutputStream("F://Program//Agam.txt");
		for(int i=0;i<arr.length;i++)
		{
			fo.write(arr[i]);
		}
		FileInputStream fis= new FileInputStream("F://Program//Agam.txt");
		int size=fis.available();
		System.out.println("Size is:"+size);
		for(int j=0;j<size;j++)
		{
			System.out.println(fis.read());
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
filedemo oo= new filedemo();
oo.readdata();
oo.WriteData();
		
	}

}

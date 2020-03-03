package FileHandling;
import java.io.*;
public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedWriter bf=null;
try
{
FileWriter fw= new FileWriter("F://Program//Agam.txt");
bf=new BufferedWriter(fw);
char[] aa= {'a','b'};
for(int i=0;i<aa.length;i++)
{
	bf.write(aa[i]);
}
}
catch(Exception e)
{
	e.printStackTrace();
}
finally
{
	bf.close();
}
	}

}

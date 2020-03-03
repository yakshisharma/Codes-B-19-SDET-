package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectordemo {
	Vector<Object> v=new Vector<>();
	public void addData()
	{
		v.add(23);
		v.add("Yakshi");
		v.add(45);
		System.out.println(v);
//		Iterator<Object> o=v.iterator();
//		while(o.hasNext())
//		{
//			System.out.println(o.next());
//		}
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vectordemo oo= new vectordemo();
oo.addData();
	}

}

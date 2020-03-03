package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class collectiondemo {
	ArrayList<Object> a1=new ArrayList<>();
	public void addData()
	{
		a1.add(1);
		a1.add("Shalini");
		a1.add(2);
		a1.add("SDET");

		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(3));
		a1.remove(2);
		System.out.println(a1);
		//a1.clear();
		//System.out.println(a1);
		System.out.println(a1.contains(1));
//		for(Object a:a1 )
//		{
//			System.out.println(a);
//		}
		Iterator<Object> i =a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ListIterator<Object> i1= a1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
						
		}
		System.out.println("Back Loop");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
collectiondemo oo=new collectiondemo();
oo.addData();
	}

}

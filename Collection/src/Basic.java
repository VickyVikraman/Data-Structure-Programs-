import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Basic {
	public static void main(String ar[])
	{
		LinkedList<Integer> c=new LinkedList<>();
		c.add(5);
		c.add(53);
		c.add(52);
		c.add(15);
		Iterator<Integer> i=c.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		for(Object i1:c)
		{
			System.out.println(i1);
		}
		Iterator it=c.iterator();
		c.remove(5);
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

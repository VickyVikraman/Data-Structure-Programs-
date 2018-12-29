import java.util.ArrayList;
import java.util.Collection;

public class SimpleArrayList {
	public static void main(String ar[])
	{
		Collection c=new ArrayList();
		ArrayList<Integer> c1=new ArrayList<>();
		ArrayList<Integer> c2=new ArrayList<>(10);
		c.add(4);
		c.add(10);
		c.add("Vi00");
		c1.add(4);
		c1.add(10);
		c1.add(8);
		c1.ensureCapacity(55);
		System.out.println(c1.size());
		c2.add(4);
		c2.add(10);
		c2.add(8);
		System.out.println(c2.size());
		c2.trimToSize();
		System.out.println(c2.size());
		c1.addAll(c2);
		c1.forEach(System.out::println);
	}
}

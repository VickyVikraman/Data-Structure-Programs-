import java.util.Enumeration;
import java.util.Vector;

public class VectorInList {
	public static void main(String ar[])
	{
		Vector v=new Vector<Integer>();
		v.add(10);
		v.add(15);
		v.add(14);
		v.add(13);
		v.add(12);
		v.add(11);
		v.add(10);
		v.add(15);
		v.add(14);
		v.add(13);
		v.add(12);
		v.add(11);
		v.add(10);
		v.add(15);
		v.add(14);
		v.add(13);
		v.add(12);
		v.add(11);
		v.add(12);
		v.add(11);
		System.out.println(v.capacity());
		for(Object o:v)
		{
			System.out.println(o);
		}
		Enumeration e=v.elements();
	}
}

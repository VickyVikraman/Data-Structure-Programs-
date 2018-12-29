import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listing {
	public static void main(String ar[])
	{
		List<Integer> l=new ArrayList<Integer>(8);
		l.add(10);
		l.add(13);
		l.add(12);
		l.add(11);
		
		l.add(0, 9);
		Collections.sort(l);
		l.forEach(System.out::println);
		Listing l1 = new Listing();
		System.out.println(l);
	}
}

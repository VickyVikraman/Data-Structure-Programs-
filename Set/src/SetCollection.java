import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String ar[])
	{
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(16);
		s.add(14);
		s.add(13);
		s.add(12);
		s.forEach(System.out::println);
	}
}

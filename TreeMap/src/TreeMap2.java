import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2
{
	public static void main(String ar[])
	{
		Map<Integer,Integer> t=new TreeMap<>();
		t.put(0, 1);
		t.put(4, 5);
		t.put(3, 4);
		t.put(1, 3);
		t.put(2, 2);
		Set s=t.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println("Key: "+me.getKey()+" & Value: "+me.getValue());
		}
	}
}

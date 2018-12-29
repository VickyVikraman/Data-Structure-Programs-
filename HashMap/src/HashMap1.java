import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String arg[])
	{
		HashMap<Integer, String> h=new HashMap<>();
		h.put(1,"Vicky");
		h.put(4,"vikraman");
		h.put(3,"sachin");
		h.put(5,"vignesh");
		h.put(2,"sabari");
		h.put(5,"ucyhcg");
		Iterator i=h.entrySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(Map.Entry m:h.entrySet())	//Entry is nested interface for Map
		{
			System.out.println("Key: "+m.getKey()+" & Value: "+m.getValue());
		}
		Set<Integer> s1=h.keySet();
		for(int b:s1)
		{
			System.out.println("Key: "+b+" & Value: "+h.get(b));
		}
	}
}

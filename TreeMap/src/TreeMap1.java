import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 
{
	public static void main(String args[]) {
		 
	    Map<Integer, String> treemap = new TreeMap<Integer, String>();

	    // Put elements to the map
	    treemap.put(1, "Jack");
	    treemap.put(2, "Rick");
	    treemap.put(3, "Kate");
	    treemap.put(4, "Tom");
	    treemap.put(5, "Steve");
	 
	    Set set = treemap.entrySet();
	    Iterator i = set.iterator();
	    // Display elements
	    while(i.hasNext()) {
	      Map.Entry me = (Map.Entry)i.next();
	      System.out.print(me.getKey() + ": ");
	      System.out.println(me.getValue());
	    }
	  }
}

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Default {
	public static void main(String ar[])
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
//		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(40);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		
		System.out.println(pq);
		
	}
}

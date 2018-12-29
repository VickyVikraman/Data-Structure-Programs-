
public class Run {
	public static void main(String ar[])
	{
		LinkedList l=new LinkedList();
		l.insert(5);
		l.insert(10);
		l.insert(17);
		l.insert(12);
		l.insert(13);
//		l.show();
		l.insertAtStart(113);
		l.insertAt(2,25);
//		l.show();
		l.delete(5);
		l.show();
	}
}

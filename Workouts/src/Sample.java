import java.util.Stack;

class Sample
{
	public static void main(String args[]) 
	{
		Integer i = 35;
		Double d = 33.3;
		d = d + i;
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(25);
		System.out.println(s.size());
		s.pop();
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.capacity());
		
		System.out.println("Value of d is " + d);
	}
}
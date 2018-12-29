import java.util.Scanner;
public class LinkedList {
	static Node head,head2,head3;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String arg[])
	{
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		while(n!=0)
		{
			l.push(n%10);
			n=n/10;
		}
		while(d!=0)
		{
			l.push2(d%10);
			d=d/10;
		}
//		l.print();
//		l.print2();
		l.addReverse(head,head2);
		l.printadd();
	}
	public void addReverse(Node head,Node head2)
	{
		LinkedList l=new LinkedList();
		Node a=head,b=head2;
		int sum=0,carry=0;
		while((a!=null)||(b!=null))
		{
			if((a!=null)&&(b!=null))
			{
				sum=a.data+b.data+carry;
				carry=sum/10;
				l.insertnew(sum%10);
				a=a.next;
				b=b.next;
			}
			else if(a!=null)
			{
				sum=a.data+carry;
				carry=sum/10;
				l.insertnew(sum%10);
				a=a.next;
			}
			else if(b!=null)
			{
				sum=b.data+carry;
				carry=sum/10;
				l.insertnew(sum%10);
				b=b.next;
			}
//			a=a.next;
//			b=b.next;
		}
		if(carry!=0)
		{
			l.insertnew(carry);
		}
//		sum=a.data+b.data+carry;
//		l.insertnew(sum);
	}
	public void printadd()
	{
		Node tnode=head3;
		while(tnode!=null)
		{
			System.out.print(tnode.data);
			tnode=tnode.next;
		}
	}
	public void insertnew(int d)
	{
		Node newnode=new Node(d);
		if(head3==null)
		{
			head3=newnode;
			head3.next=null;
		}
		Node tnode=head3;
		while(tnode.next!=null)
		{
			tnode=tnode.next;
		}
		tnode.next=newnode;
		newnode.next=null;
	}
	public void push(int d)
	{
		Node newnode=new Node(d);
		if(head==null)
		{
			head=newnode;
			head.next=null;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void push2(int d)
	{
		Node newnode=new Node(d);
		if(head2==null)
		{
			head2=newnode;
			head2.next=null;
			return;
		}
		newnode.next=head2;
		head2=newnode;
	}
	public void print()
	{
		Node tnode=head;
		while(tnode!=null)
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	public void print2()
	{
		Node tnode=head2;
		while(tnode!=null)
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
}


public class CircularLinkedList {
	Node head;
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
	public static void main(String ar[])
	{
		CircularLinkedList cl=new CircularLinkedList();
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		cl.delete(30);
		cl.delete(60);
		cl.print();
	}
	public void delete(int data)
	{
		Node tnode=head,prev = null;
		while((tnode.next!=head)&&(tnode.data!=data))
		{
			prev=tnode;
			tnode=tnode.next;
		}
		if(tnode.data!=data)
		{
			System.out.println("Element Not Found");
		}
		if(tnode.data==data)
		{
//			System.out.println(prev.data+" "+prev.next.data+" "+tnode.next.data);
			prev.next=tnode.next;
			return;
		}
		
	}
	public void print()
	{
		Node tnode=head.next;
		do
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}while(tnode!=head);
	}
	public void insert(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.next=head;
		}
		Node newnode=new Node(data);
		Node tnode=head;
		while(tnode.next!=head)
		{
			tnode=tnode.next;
		}
		tnode.next=newnode;
		newnode.next=head;
		
	}
}

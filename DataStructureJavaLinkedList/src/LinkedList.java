
public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	public void insertAtStart(int data)
	{
		Node n=new Node();
		n.data=data;;
		n.next=head;
		head=n;
		
	}
	public void insertAt(int pos,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(pos==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node n=head;
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void delete(int pos)
	{
		if(pos==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
}

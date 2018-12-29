
public class DoublyLinkedList {
	Node head;
	class Node
	{
		int data;
		Node right,left;
		Node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	public static void main(String[] args) 
	{
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.insert(50);
		dl.delete(30);
		dl.print();
	}
	public void delete(int data)
	{
		Node tnode=head;
		Node prev = null;
		while((tnode!=null)&&(tnode.data!=data))
		{
			prev=tnode;
			tnode=tnode.right;
		}
//		System.out.println("Left:"+prev.data+"right:"+tnode.right.data+"tnode data:"+tnode.data);
		prev.right=tnode.right;
		tnode.right.left=tnode.left;
	
	}
	public void insert(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.right=head.left=null;
			return;
		}
		Node newnode=new Node(data);
		newnode.right=null;
		Node tnode=head;
		while(tnode.right!=null)
		{
			tnode=tnode.right;
		}
		newnode.left=tnode;
		tnode.right=newnode;
		
	}
	public void print()
	{
		Node tnode=head;
		while(tnode.right!=null)
		{
			System.out.println(tnode.data);
			tnode=tnode.right;
		}
		System.out.println(tnode.data);
		System.out.println();
//		while(tnode!=null)
//		{
//			System.out.println(tnode.data);
//			tnode=tnode.left;
//		}
			
	}

}

public class StudentLinkedList {
	class Node
	{
		Node next;
		Student student;
	}
	Node head;
	public StudentLinkedList(Student s)
	{
		head=new Node();
		head.student=s;
		head.next=null;
	}
	public void insertAtFirst(Student s)
	{
		Node node = new Node();
		node.student=s;
		node.next=head;
		head=node;
	}
	public void deleteFirst()
	{
		head=head.next;
	}
	public void insert(Student s)
	{
		Node newnode=new Node();
		Node node=head;
		while(node.next!=null)
		{
			node=node.next;
		}
		newnode.student=s;
		newnode.next=null;
		node.next=newnode;
	}
	public void printList()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.student.toString());
			node=node.next;
		}
	}
	public void deleteByRoll(String roll)
	{
		Node node=head.next;
		Node temp=head;
		while((node!=null)&&!(node.student.getRoll().equals(roll)))
		{
			temp=node;
			node=node.next;
		}
		if(node!=null)
		{
			temp.next=node.next;
		}
	}
}

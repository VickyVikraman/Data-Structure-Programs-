
public class CircularLinkedList {

	public static void main(String[] args) {
		Funct f=new Funct();
		f.insert(1);
		f.insert(0);
		f.insert(3);
		f.insert(6);
		f.insert(2);
//		f.printlist();

	}

}
class Node
{
	int key;
	Node addr;
}
class Funct
{
	Node head=null;
	public void insert(int key)
	{
		Node node=new Node();
		node.key=key;
		node.addr=null;
		if(head==null)
		{
			head=node;
			head.addr=head;
			System.out.println(node.key);
		}
		else 
		{
			Node n=head;
			while(n.addr!=head)
			{
				n=n.addr;
			}
			node.addr=head;
			n.addr=node;
			System.out.print(node.key);
//			Node pri=n;
//			while(pri.addr!=n)
//			{
//				System.out.print(pri.key);
//				pri=pri.addr;
//			}
			System.out.println();
		}
	}
	public void printlist()
	{
		Node node=head;
		
		do
		{
			System.out.println(node.key);
			node=node.addr;
		}while(node.addr!=head);
		System.out.println(node.key);
	}
}

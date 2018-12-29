import java.util.Scanner;

public class Summa
{
	Node head;
	class Node
	{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	public static void main(String arg[])
	{
		int n,d;
		Summa s=new Summa();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int d1=sc.nextInt();
			s.insert(d1);
		}
		s.rotateLeft(d);
	}
	public void rotateLeft(int d)
	{
		Node tnode=head;
		int i=0;
		while((i!=d)&&(tnode.right!=head))
		{
			tnode=tnode.right;
			i++;
		}
		Node dthNode=tnode;
		do
		{
			System.out.print(dthNode.data);
			dthNode=dthNode.right;
		}while(dthNode!=tnode);
	}
	public void print()
	{
		Node tnode=head;
		do
		{
			System.out.println(tnode.data);
			tnode=tnode.right;
		}while(tnode!=head);
	}
	public void insert(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.left=head.right=head;
			return;
		}
		Node newnode=new Node(data);
		Node tnode=head;
		while(tnode.right!=head)
		{
			tnode=tnode.right;
		}
		newnode.left=tnode;
		newnode.right=head;
		tnode.right=head.left=newnode;
	}
}
import java.util.Scanner;

public class LinkedList {
	Node head,head1;
	class Node
	{
		char data;
		Node next;
		Node(char a)
		{
			data=a;
			next=null;
		}
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		String s=sc.next();
		int len=s.length();
		char a[]=s.toCharArray();
		int i=0;
		while(i!=len)
		{
			l.insert(a[i]);
			i++;
		}
		l.trace(len);
		l.printnew();
	}
	public void printnew()
	{
		Node tnode=head1;
		while(tnode!=null)
		{
			System.out.print(tnode.data);
			tnode=tnode.next;
		}
	}
	public void trace(int length)
	{
		Node tnode=head.next;
		Node newnode = new Node(head.data);
		newnode.next=null;
		head1=newnode;
		head1.next=null;
		int flag=1;
		while(tnode!=null)
		{
			
			while(newnode!=null)
			{

				String ch=String.valueOf(newnode.data);
				String ch1=String.valueOf(tnode.data);
				if(ch.equalsIgnoreCase(ch1))
				{
					char nw=ch1.charAt(0);
					if(nw=='z')
					{
						nw='a';
					}
					else
					{
						nw++;
					}
					Node temp=head1;
					Node t=null;
					while(temp!=null)
					{
						
						if(temp.data==Character.toLowerCase(nw) || temp.data == Character.toUpperCase(nw) )
						{	
							nw++;
							System.out.println(nw);
						}
						t=temp;
						temp=temp.next;
					}
					newnode=new Node(nw);
					t.next=newnode;
					newnode.next=null;
					flag=0;
					break;
				}
				newnode=newnode.next;
			}
			if(flag!=0)
			{
//				System.out.println("new:"+tnode.data);
				char ch=tnode.data;
				Node temp=head1;
				Node t=null;
				newnode=new Node(ch);
				while(temp!=null)
				{
					t=temp;
					temp=temp.next;
				}
				t.next=newnode;
				newnode.next=null;
				System.out.println("Fresh:"+newnode.data);
			}
			newnode=head1;
			tnode=tnode.next;
		}
	}
	public void print()
	{
		Node tnode=head;
		while(tnode!=null)
		{
			System.out.print(tnode.data);
			tnode=tnode.next;
		}
	}
	public void insert(char d)
	{
		if(head==null)
		{
			head=new Node(d);
			head.next=null;
			return;
		}
		Node newnode=new Node(d);
		newnode.next=null;
		Node tnode=head;
		while(tnode.next!=null)
		{
			tnode=tnode.next;
		}
		tnode.next=newnode;
		return;
	}
}

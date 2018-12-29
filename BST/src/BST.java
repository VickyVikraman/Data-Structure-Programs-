public class BST 
{
	Node root;
	public BST()
	{
		root=null;
	}
	public void insert(BSTStudent s)
	{
		root=insertRecord(root,s);
	}
	Node insertRecord(Node root,BSTStudent s)
	{
		if(root==null)
		{
			root=new Node(s);
			return root;
		}
		if(s.age<root.item.getAge())
		{
			root.left=insertRecord(root.left,s);
		}
		else if(s.age>root.item.getAge())
		{ 
			root.right=insertRecord(root.right,s);
		}
		return root;
	}
	public void inOrder()
	{
		print(root);
	}
	public void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		print(root.left);
		System.out.print(root.item.printDetail()+"->");
		print(root.right);
	}
}
public class BinarySearchTree {

	 static Node root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	public void insert(int key)
	{
		root=insertRecord(root,key);
	}
	Node insertRecord(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key<root.key)
		{
			root.left=insertRecord(root.left, key);
		}
		else if(key>root.key)
		{
			root.right=insertRecord(root.right, key);
		}
		return root;
		
	}
	public Node search(Node root,int key)
	{
		if(root==null || root.key==key)
		{
			return root;
		}
		if(root.key>key)
		{
			return search(root.left,key);
		}
		return search(root.right,key);
	}
	public void inorder()
	{
		inordershow(root);
	}
	public void inordershow(Node root)
	{
		if(root==null)
		{
//			System.out.println("null");
			return;
		}
		inordershow(root.left);
		System.out.print(root.key+"->");
		inordershow(root.right);
	}
	public void delete(int key)
	{
		root=deleteRecord(root,key);
	}
	public Node deleteRecord(Node root,int key)
	{
		if(root==null)
		{
			return root;
		}
		if(root.key>key)
		{
			root.left=deleteRecord(root.left, key);
		}
		else if(root.key<key)
		{
			root.right=deleteRecord(root.right, key);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			root.key=minValue(root.right);
			
			root.right=deleteRecord(root.right, root.key);
		}
		return root;
	}
	public int minValue(Node root)
	{
		int minv=root.key;
		while(root.left!=null)
		{
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(45);
        tree.insert(75);
        tree.insert(65);
        tree.insert(85);
        System.out.println(tree.search(root, 70).key);
		tree.inorder();
		tree.delete(70);
		System.out.println();
		tree.inorder();
	}

}

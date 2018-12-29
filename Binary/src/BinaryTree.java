
public class BinaryTree {
	Node root;
	public BinaryTree()
	{
		root=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();
		System.out.println();
		System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

	}
	void printInorder()   
	{  
		printInorder(root);  
	}
	void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + "->");
 
        /* now recur on right child */
        printInorder(node.right);
//        System.out.println();
    }
	void printPreorder()
	{
		printPreorder(root);
	}	
	void printPreorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.key+"->");
		printPreorder(node.left);
		printPreorder(node.right);
//		System.out.println();
	}
	void printPostorder()
	{
		printPostorder(root);
	}
	void printPostorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key+"->");
	}
	

}

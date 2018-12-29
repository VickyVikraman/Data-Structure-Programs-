
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTStudent s1=new BSTStudent(19,"Vigraman");
		BSTStudent s2=new BSTStudent(20, "sabari");
		BSTStudent s3=new BSTStudent(18, "sachin");
		BSTStudent s4=new BSTStudent(21, "pandi");
		BSTStudent s5=new BSTStudent(22, "muja");
		BSTStudent s6=new BSTStudent(23, "para");
		BSTStudent s7=new BSTStudent(15, "venga");
		BSTStudent s8=new BSTStudent(12, "tamil");
		BSTStudent s9=new BSTStudent(17, "vijay");
//		BST summa=new BST(s1);
		BST s=new BST();
		s.insert(s1);
		s.inOrder();
		System.out.println();
		s.insert(s2);
		s.inOrder();
		System.out.println();
		s.insert(s3);
		s.inOrder();
		System.out.println();
		s.insert(s4);
		s.insert(s5);
		s.insert(s6);
		s.insert(s7);
		s.insert(s8);
		s.insert(s9);
		s.inOrder();
	}
}


public class Main {

	public static void main(String[] args) 
	{
		Student s=new Student("112","Vigraman");
		Student s1=new Student("66","Rajashri");
		Student s2=new Student("6","Virajit");
		Student s3=new Student("5","Rajvika");
		StudentLinkedList list=new StudentLinkedList(s);
		list.insert(s1);
		list.insertAtFirst(s2);
		list.insertAtFirst(s3);
		list.printList();
//		list.deleteFirst();
		System.out.println();
//		list.printList();
		list.deleteByRoll("112");
		list.printList();
	}

}

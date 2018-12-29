import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sample {
	public static void main(String ar[])
	{
		String a="Study";
//		String s=new String("Study").intern();
		String s1=new String("Study");
		
		System.out.println(a.replace('u','t'));
		System.out.println(a);
		
		
			String str = new String("Site is BeginnersBook.com");

	       System.out.print("String after replacing com with net :" );
	       System.out.println(str.replaceFirst("com", "net"));

	       System.out.print("String after replacing Site name:" );
	       System.out.println(str.replaceFirst("Bo(.*)", "XYZ.com"));
	       System.out.println(str.replaceFirst("Bo", "XYZ.com"));
	       Scanner sc=new Scanner(System.in);
	       
	       String str1="He Hello How r u";
	       String []st=str1.split(" ");
	       LinkedList<String> ar1=new LinkedList<>();
	       ar1.addAll(Arrays.asList(st));
	       Collections.sort(ar1);
	       System.out.println(ar1);
	       String s="12312";
	       int a1=Integer.parseInt(s);
	       System.out.println(a1);
	       StringBuffer n=new StringBuffer(5);
//	       n.insert(0,sc.nextLine());
	       System.out.println(n+" "+n.capacity());
	       char b= 'A';
	       System.out.println((char)(b+10));
		
	}
}

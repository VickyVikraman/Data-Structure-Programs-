import java.util.Scanner;
class Cross
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- >0)
	 {
	     String str=sc.next();
	     for(int i=0;i<str.length();i++)
	     {
	         for(int j=0;j<str.length();j++)
	         {
	             if(i==j)
	             System.out.print(str.charAt(i));
	             else if(i+j==str.length()-1)
	             System.out.print(str.charAt(j));
	             else
	             System.out.print(" ");
	         }
	         System.out.println();
	     }
	     System.out.println();
	 }
	 }
}
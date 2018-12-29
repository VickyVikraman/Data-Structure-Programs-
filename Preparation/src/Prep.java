import java.util.Scanner;

public class Prep 
{
	Base b=new Base();
 public static void main(String ar[])
 {

	 System.out.println("with parameter");
	 Scanner sc= new Scanner(System.in);
//	 Integer i=sc.nextInt();
//	 System.out.println(i);
	 Domain d= new Domain();
	 Domain d1=new Domain(2,3);
	 String Str1= new String("ABCD");
	 String Str2= new String("ABCD");
	 if(Str1 == Str2)
	 {
		 System.out.println("String 1 == String 2 is true");
	 }
	 else
	 {
		 System.out.println("String 1 == String 2 is false");
		 String Str3 = Str2;
		 if( Str2 == Str3)
		 {
			 System.out.println("String 2 == String 3 is true");
		 }
		 else
		 {
			 System.out.println("String 2 == String 3 is false");
		 }
		 if(Str1.equals(Str2))
		 {
			 System.out.println("String 1 equals string 2 is true");
			 if(Str1.equals(Str3))
			 {
				 System.out.println("Str1 equals Str3");
			 }
			 if(Str1==Str3)
			 {
				 System.out.println("Str1 == Str3");
			 }
		 }
		 else
		 {
			 System.out.println("String 1 equals string 2 is false");
		 }
		 int c,b;
		 Sample sam= new Sample(2,3)
		 {
		};
		Base obj= new Derived();
		obj.display();
		obj.print();
        A a = null;
        
        a.equals(null);
 
        a.hashCode();
 
        a.toString();
	 }
 }
 private native void method();
public static void main()
 {
	 System.out.println("without parameter");
 }
}
class Domain
{
	int a,b;
	public Domain(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public Domain() {
		// TODO Auto-generated constructor stub
	}
}
abstract class Sample
{

	public Sample(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	
}


class Base {
	 static void display() 
	{
		System.out.println("Static or class method from Base");
	}
	public void print() 
	{
		System.out.println("Non-static or instance method from Base");
	}
}
class Derived extends Base 
{
	static void display() 
	{
		System.out.println("Static or class method from Derived");
	}
	public void print() 
	{
		System.out.println("Non-static or instance method from Derived");
	}
}
interface A
{    
 
}
import java.util.Scanner;

public class SubSet
{
	public static void main(String ar[])
	{
		int top=-1;
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		StringBuilder b=new StringBuilder(a);
		int []stack=new int[a.length()];
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='(')
			{
				stack[++top]=i;
			}
			if(a.charAt(i)==')')
			{
				if(top!=-1 && a.charAt(stack[top])=='(' )
				{
					top=top-1;
				}
				else
				{
					stack[++top]=i;
				}
			}
		}
		while(top!=-1)
		{
			b.deleteCharAt(stack[top--]);
		}
		System.out.println(b);
	}
}
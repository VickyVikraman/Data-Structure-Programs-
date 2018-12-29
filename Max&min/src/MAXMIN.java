import java.util.Scanner;

public class MAXMIN 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[1];
		if(a[0]>a[1])
		{
			max=a[0];
			min=a[1];
		}
		else
		{
			min=a[0];
			max=a[1];
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max="+max+"Min="+min);
		
	}
}

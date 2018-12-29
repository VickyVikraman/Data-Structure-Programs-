import java.util.Arrays;

public class SubSet 
{
	public static void main(String ar[])
	{
		int a[]= {10, 7, 5, 18, 12, 20, 15};
		int n=a.length;
//		Arrays.sort(a);
		int sol[]=new int[n];
		find(a,0,0,35,sol);
	}
	public static void find(int a[],int cur,int index,int sum,int sol[])
	{
		if(cur==sum)
		{
//			System.out.println("Subset Found");
			for(int i=0;i<a.length;i++)
			{
				if(sol[i]==1)
				{
					System.out.print(" "+a[i]);
				}
			}
			System.out.println();
		}
		else if(index==a.length)
		{
			return;
		}
		else
		{
			sol[index]=1;
			cur+=a[index];
			find(a,cur,index+1,sum,sol);
			cur-=a[index];
			sol[index]=0;
			find(a,cur,index+1,sum,sol);
		}
	}
}

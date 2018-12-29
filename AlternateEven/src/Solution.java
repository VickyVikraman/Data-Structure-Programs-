
public class Solution 
{
	public static void main(String ar[])
	{
		int a[]= {1,3,2,6,8,7}; //op{2 1 6 3 8 7}
		int b[]=new int[a.length];
		int i,z=0;	
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i%2==0)
				{
					if((a[j]!=-1)&&(a[j]%2==0))
					{
						b[i]=a[j];
						a[j]=-1;
						break;
					}
				}
				else
				{
					if((a[j]!=-1)&&(a[j]%2!=0))
					{
						b[i]=a[j];
						a[j]=-1;
						break;
					}
				}
			}
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}

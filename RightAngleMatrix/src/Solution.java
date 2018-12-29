import java.util.Scanner;

public class Solution 
{
	public static void main(String ar[])
	{
		int r,c;
		Scanner sc= new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[c][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int z=0;
		for(int i=c-1;i>=0;i--)
		{
			for(int j=0;j<r;j++)
			{
				b[z][j]=a[j][i];
			}
			z++;
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

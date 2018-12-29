import java.util.Scanner;

public class Spiral 
{
	static int r,c;
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int sol[][]=new int[r][c];
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
		System.out.println("Print");
		
	}
	
}
import java.util.Scanner;
public class Cross 
{
	public static void main(String ar[])
	{
		String s;
		Scanner sc= new Scanner(System.in);
		s=sc.next();
		int sp=s.length()-2,ft=0;
		int z=0,st=0,lst=s.length()-1;
		while(z!=s.length())
		{
			if(z<lst)
			{
				for(int i=0;i<st;i++)
				{
					System.out.print(" ");
				}
				System.out.print(s.charAt(z));
				for(int i=0;i<sp;i++)
				{
					System.out.print(" ");
				}
				System.out.print(s.charAt(lst));
				st++;
				sp=sp-2;
				z++;
				lst--;
			}
			else if(z>lst)
			{
				st--;
				for(int i=0;i<st;i++)
				{
					System.out.print(" ");
				}
				System.out.print(s.charAt(lst));
				sp=sp+2;
				for(int i=0;i<sp;i++)
				{
					System.out.print(" ");
				}
				System.out.print(s.charAt(z));
				z++;
				lst--;
			}
			else if(z==lst)
			{
				for(int i=0;i<st;i++)
				{
					System.out.print(" ");
				}
				System.out.print(s.charAt(z));
				z++;
				lst--;
			}
			System.out.println();
		}
	}

}

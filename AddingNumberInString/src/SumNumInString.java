import java.util.Scanner;

public class SumNumInString {
	public static void main(String ar[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			/*if(!Character.isLetter(s.charAt(i))) //By Using Function
			{
				int nw=Integer.parseInt(String.valueOf(s.charAt(i)));
				sum=sum+nw;
			}*/
			if((s.charAt(i)>=48)&&(s.charAt(i)<=57))
			{
				int nw=Integer.parseInt(String.valueOf(s.charAt(i)));
				sum=sum+nw;
			}
		}
		System.out.println(sum);
	}
}

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmer
{
	public static void main(String ar[])
	{
		int a[]= new int[] {1,2,3,4,6,5,6};
		String s=a.toString();
		System.out.println(s.lastIndexOf("6"));
	}
}
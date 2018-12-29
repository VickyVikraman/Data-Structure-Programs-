
public class Summa {
	public static void main(String ar[])
	{
		Contain<Integer> c=new Contain<Integer>(100);
		System.out.println(c.show());
	}
	
}
class Contain<T>
{
	T num;
	Contain(T o)
	{
		num=o;
	}
	T show()
	{
		return num;
	}
	
}

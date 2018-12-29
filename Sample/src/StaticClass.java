public class StaticClass 
{	
	public static void main(String[] ar)
	{
		Summa.printing();
	}	
}
class Summa
{
	static int i=0;
	 static void printing()
	{
		System.out.println(i);
		i++;
		if(i!=5)
		{
			printing();
		}
	}
}

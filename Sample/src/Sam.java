
public class Sam {
	public static void main(String ar[])
	{
		int a=10;
		Integer sum=new Integer(5);
		int c=sum;
		Float f=10.5f;
		String s="10.5f";
		Integer g=Integer.valueOf(c);
		Float f1=Float.parseFloat(s);
		System.out.println(f1);
		String dec=f.toString();
		System.out.println(dec);
		Integer summa=a;
		System.out.println("Int to Integer:"+summa+"Integer to Int:"+c);
	}

}

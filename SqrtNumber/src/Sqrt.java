
public class Sqrt {

	public static void main(String[] args) 
	{
		double t;
		 int number=6;
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		System.out.println(squareRoot);

	}

}

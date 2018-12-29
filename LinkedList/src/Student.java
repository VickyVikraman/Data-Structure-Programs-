
public class Student {
	String roll,name;
	public Student(String roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public String getRoll()
	{
		return this.roll;
	}
	public String toString()
	{
		return this.roll+" "+this.name;
	}
}

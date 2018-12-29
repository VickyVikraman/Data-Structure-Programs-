public class BSTStudent {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BSTStudent(int age,String name)
	{
		this.setName(name);
		this.setAge(age);
	}
	
	public String printDetail()
	{
		return "Name:"+name+" & Age:"+age;
	}

}

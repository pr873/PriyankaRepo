package packageA;

public class Constructor 
{
	public Constructor()
	{
		this (1, 2, 3);
		System.out.println("Default constructor..");
	}
	public Constructor(int a, int b)
	{
		System.out.println("Two parameterized constructor..");
	}
	public Constructor(int a)
	{
		System.out.println("One parameterized constructor..");
	}
	public Constructor(int a, int b, int c)
	{
		System.out.println("Three parameterized constructor..");
	}
	public static void main(String[] args) {
		Constructor ob2 = new Constructor();
		Constructor ob3 = new Constructor(1);
		Constructor ob4 = new Constructor(1, 4);
	}
}


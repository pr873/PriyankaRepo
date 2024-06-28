package packageA;

public class Student {
	int Age;
	int Rollno;
	public void display()
	{
	System.out.println("Welcome to all of you");
	System.out.println("Automation is very easy");
	}

	public static void main(String[] args) 
	{
		Student xyz=new Student();
		xyz.display();
		xyz.Age=10;
		xyz.Rollno=3;
		System.out.println("Age ="+xyz.Age);
		System.out.println("Rollno ="+xyz.Rollno);
	}

}

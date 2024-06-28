package packageA;

public class Arithmatic {
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int mult(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a, int b)
	{
		int c=a/b;
		return c;
	}
public static void main(String[] args)
{
Arithmatic value=new Arithmatic();
int ans1=value.sum(10, 2);
int ans2=value.sum(ans1, 2);
int ans3=value.sub(ans2, 2);
int ans4=value.mult(ans3, 2);
int ans5=value.div(ans4, 2);
System.out.println("To calculate (((((10+2)+2)-2)*2)/2)");
System.out.println("The calculation answer is "+ans5);
}
}
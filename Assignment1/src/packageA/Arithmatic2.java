package packageA;

public class Arithmatic2 {
//(((((10*2)-2)+2)-2)/2
	public int mult(int a, int b) {
	int c=a*b;
	return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		return c;
		}
	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	public int div(int a, int b) {
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		Arithmatic2 value = new Arithmatic2();
		int result1=value.mult(10, 2);
		int result2=value.sub(result1, 2);
		int result3=value.sum(result2, 2);
		int result4=value.sub(result3, 2);
		int result5=value.div(result4, 2);
		System.out.println("To calculate ((((10*2)-2)+2)-2)/2");
		System.out.println("The value for arithmatic equation is "+result5);
	}
}

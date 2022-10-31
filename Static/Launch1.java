package Static;

public class Launch1 {
	
	static int a;
	static int b;
	static int c;
	
	static
	{
		System.out.println("static block");
		a = 10;
		b = 20;
		c = 30;
	}

	static
	{
		System.out.println("static block");
		a = 10;
		b = 20;
		c = 30;
	}
	
	public static void disp1() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		disp1();
	}

}

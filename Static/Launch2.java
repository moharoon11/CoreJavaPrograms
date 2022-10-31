package Static;

public class Launch2 {
	
	static int a,b,c;
	
	int m,n,o;
	static void disp1() {
		System.out.println("static method disp1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	
	static {
		System.out.println("static block");
		a = 10;
		b = 20;
		c = 30;
	}
	
	{
	  System.out.println("non static block");
	  m = 40;
	  n = 50; 
	  o = 60;
	  a = 70;
	  b = 80;
	  c = 90;
	}
	
	public void disp2() {
		System.out.println("non static method disp2");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

	Launch2(){
		System.out.println("contructor");
	}

	
	public static void main(String[] args) {
		System.out.println("main method");
		disp1();
		Launch2 a = new Launch2();
		a.disp2();
	}

}

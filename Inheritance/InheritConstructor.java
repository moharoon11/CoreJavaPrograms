package Inheritance;

class c1{
	
	public c1() {
		System.out.println("c1 constructor");
	}
	public c1(int i) {
		System.out.println("parametrized c1 constructor");
	}
}

class c2 extends c1{
	
	int i = 15;
	public c2() {
		System.out.println("c2 constructor");
	}
	public c2(int i) {
		System.out.println("parametrized c2 constructor");
	}
	
}

class c3 extends c2{
	
	
	
	public c3() {
		System.out.println("c3 constructor");
	}
	
	public c3(int i) {
		super(i);
		System.out.println("parametrized c3 constructor");
	}
}

public class InheritConstructor {

	public static void main(String[] args) {
		c3 c=new c3(3);
		
	    System.out.println(c.i);
	    
	       
    }

}

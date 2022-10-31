
package Interface;


public interface One {

	default void sum() {
		System.out.println("sum in one");
	}
	
	static void sub() {
		System.out.println("static sub in one");
		
	}
}

interface Two extends One {
	
	
	
}

class name implements Two {
	public static void main(String[] args) {
		 
	}
	
	
}

class Test{
	public static void main(String[] args) {
		name n = new name();
		n.sum();
		// n.sub();
		One.sub();
		Two.sub();
		
		
		
	}
}

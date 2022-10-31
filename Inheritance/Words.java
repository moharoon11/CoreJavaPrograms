package Inheritance;

// This is called IS-A-RELATIONSHIP
public class Words {

	
	 Words(){
		System.out.println("parent class constructor");
	}
	 private String name;
	 
	 final double pi = 3.14;
	 
	 final void finalMethod() {
		 System.out.println("final method in parentclass");
	 }
	 
	private void privateMethod() {
		System.out.println("private method in parent");
	}
	void method1() {
		System.out.println("method 1 in parent");
	}
	
	void method2() {
		System.out.println("method2 in parent");
	}
}

class abc extends Words{
	 
//	void finalMethod() {
//		System.out.println("overriding final method from parent");
//	} -> final method participate inheritance but we cannot override it
	
	
	public abc() {
		System.out.println("child class constructor");
	}
	protected void method1() {
		System.out.println("method1 in child");
	}
	
	void add() {
		System.out.println("Specialized method -> addition is : " + (10 + 10));
	}
}

class check {
	 public static void main(String[] args) {
		
		 abc a = new abc();
		 Words w = new abc(); // upcasting
		 
		
		 a.method1();
		 w.method1();
		 
		 a.method2();
		 w.method2();
		 
		 a.add();
		//  w.add();
		 
		 ((abc)w).add();
		 
//		 Words wq = new Words();
//		 wq.privateMethod();     private members accesible only within the class
//		 wq.name = "name";
		 
		 //  a.pi = 3.45; --> final var cannot change
		 System.out.println(a.pi);
		 a.finalMethod();
	}
}

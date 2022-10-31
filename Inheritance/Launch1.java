package Inheritance;
class X{
	
	public void show() {
		System.out.println("show in x class");
	}
	
	public void disp() {
		System.out.println("disp in x");
	}
	
}
class B extends X{
	
	public void show() {
	    System.out.println("show in B class");
	}
	
}

class A extends B{
	
    public void show() {
	    System.out.println("show in B");
	}
}



public class Launch1 {

	public static void main(String[] args) {
		A a=new A();
	//	a.show();
	//	a.disp();
		
      X b = new B();
      b.show();
		

	}

}

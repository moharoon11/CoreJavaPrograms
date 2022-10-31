package Interface;

interface Calculator {

	void sum(); 
	public abstract void sub();
	
	// protected void div();
	// private void mod();
	// default void pow();
}

interface Calculator1 {
	
	void div();
	void pow();
	void sum();
}

// A class can implement multiple interface
class calc1 implements Calculator,Calculator1{
	
	
	// Implementation of Calculator interface
	public void sum() {
		System.out.println("sum method implements in calc1");
	}
	
	
	public void sub() {
		System.out.println("sub method implements in calc1");
	}
	
	// Implementation of Calculator1 interface
	public void div() {
		System.out.println("div method implements in calc1");
	}
	
	public void pow() {
		System.out.println("pow method implements in calc1");
	}
	
}

class calc2 implements Calculator{
	
	public void sum() {
		System.out.println("sum method implements in calc2");
	}
	
	public void sub() {
		System.out.println("sub method implements in calc2");
	}
	
}

class calc3 implements Calculator {
	public void sum() {
		System.out.println("sum method implements in calc3");
	}
	
	public void sub() {
		System.out.println("sub method implements in calc3");
	}
}

class Helper{
	
	public void permit(Calculator calculator) {
		calculator.sum();
		calculator.sub();
	}
	
	public void permit1(Calculator1 calculator1) {
		calculator1.sum();
		calculator1.div();
		calculator1.pow();
		
	}
}

class Launch1
{
	
	public static void main(String[] args) 
	{
	
	/**
	 * calc1 c1 = new calc1();
	   c1.sum();
	   c1.sub();
	   calc2 c2 = new calc2();
	   c2.sum();
	   c2.sub();
	   calc3 c3 = new calc3();
	   c3.sum();
	   c3.sub(); -->instead implement polymorphism
	**/
		
		Helper h = new Helper();
		h.permit(new calc1());
		System.out.println();
		h.permit(new calc2());
		System.out.println();
		h.permit(new calc3());
		System.out.println();
		Calculator1 c1 = new calc1();
		h.permit1(c1);
		
		
	}
	
}



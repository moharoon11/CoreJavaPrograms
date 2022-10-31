package Interface;

interface Telusko {
	 int a = 203;// nature is --> public static final int a = 203;
	 // default nature is onlly allowed to create variables in interface
	 // private or something else is not permitted
	 
	 
	
	 
	

	void myName();
	
	default void display() {
		System.out.println("display method in telusko");
	}
	
	default void info() {
		System.out.println("This is interface Telsuko");
	}
	     
	
	static void division() {
		System.out.println("static division method in telusko");
	}
	
	default int callPrivateMethod() {
		return write();
	}
	private int write() {
		System.out.println("private write method in telusko");
		return 10;
	}
	
	private void read() {
		System.out.println("privae read method in telusko");
	}
	
	default void callPrivate() {
		read();
		noName();
	}
	
	static void callStaticPrivate() {
		noName();
	}
	private static void noName() {
		// read();
		System.out.println("no name private static methods");
	}
	
	/** we cannot have this things in interface
	 * 
	 *  private static final int b = 45;
	 *  
	 *  private final int b = 45;
	 *  
	 *  protected static  int c = 90;
	 *  
	 *  protected int c = 90;
	 * 
	 * static {
	 
		
	}
	
	{
		
	}
	
	Telusko(){
		
	}
}
	**/
	
}



class Java implements Telusko {
	
	public void myName() {
		System.out.println("my name is java");
	}
	
	public void display() {
		System.out.println("interface method overrided");
	}
	
	public void addition() {
		System.out.println("addition method in java");
	}
	
}

class Launch4 {
	
	public static void main(String[] args) {
		Java j = new Java();
		j.display();
		j.info();
		
		
		
		// j.division();
		Telusko.division();
		
		
		
		// j.read();
		j.callPrivate();
		System.out.println(j.callPrivateMethod());
		
		Telusko.callStaticPrivate();
		
		
	}
}

interface uh{
	
}

abstract class me implements Telusko, uh {
	
}

abstract class i extends Object implements Telusko {
	
}

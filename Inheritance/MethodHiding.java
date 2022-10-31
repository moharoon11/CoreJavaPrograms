package Inheritance;


class letters {
	
	public static void disp() {
		System.out.println("dsip in parent");
	}
	
//	public final void show() {
//		System.out.println("final mehod show in letters");
//	}
//	
//	public static final void display() {
//		System.out.println("final static display in parent");
//	}
}

class abcd extends letters {
	
	public static void disp() {
		System.out.println("disp in child");
	}
	
//	public final void show() {
//		System.out.println("final method show in abcd");
//	}
//	
//	public static final void display() {
//		System.out.println("final stati in chile");
//	}
}
public class MethodHiding {

	public static void main(String[] args) {
	
      abcd f = new abcd();
      f.disp();
      
      letters l = new abcd();
      l.disp();
      l.show();
	}

}

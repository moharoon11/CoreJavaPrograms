package Interface;

@FunctionalInterface
interface demo {
	void show();
	
}

interface arith {
	int add(int a, int b);
	int sub(int a, int b);
	double pow(int num, int power);
	void disp();
}

class sample implements demo {
	public void show() {
		System.out.println("show in sample");
		
	}
}

public class FuncInterface {

	public static void main(String[] args) {
		demo d = new sample();
		d.show();
		
		// Annonymous innerclass
		
		demo aic = new demo() {
			public void show() {
				System.out.println("show in annonymous inner class");
			}
		};
		
		demo id = () -> {
			System.out.println("for multiple line lambda expression");
		};
			
		demo id1 = () -> System.out.println("lambda expression for one line");
			id.show();
			id1.show();
		
		
		aic.show();
		
		arith ari = new arith() {
		
		    public int add(int a, int b) {
				return a+b;
		    }
		    public int sub(int a, int b) {
				return a-b;
		    }
		    public double pow(int num, int power) {
		         return Math.pow(num, power);
		    }
		    public void disp() {
		    	System.out.println("display function in annoyinnerclass");
		    }
		    
		 };
		 
		 int add = ari.add(10, 10);
		 int sub = ari.sub(20, 10);
		 double pow = ari.pow(3, 4);
		 
		 System.out.println(add);
		 System.out.println(sub);
		 System.out.println(pow);
		
		

	}

}

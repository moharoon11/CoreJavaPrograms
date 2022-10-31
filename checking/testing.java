package checking;

@FunctionalInterface
interface demo{
	
	void add();

}

class a {
	void sub() {
		
	}
	
}
public class testing {
     
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		
		 
		 demo d = new demo() {
			 public void add() {
				 System.out.println("implemented");
			 }
		};
		
		d.add();
		
		a g = new a() {
			public void sub() {
				System.out.println("overrided");
			}
		};
		g.sub();
		

	}

}






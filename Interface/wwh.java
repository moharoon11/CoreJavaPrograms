package Interface;

class fan {
	public void color() {
		System.out.println("color in fan");
	}

	
}


public class wwh {

	public static void main(String[] args) {
		fan f = new fan();
		
		f.color();
		
		fan f1 = new fan() {
			public void color() {
				System.out.println("color in f1");
			}
			
		
		};
		f1.color();
		
	    
		
		
		fan f2 = new fan() {
			public void color() {
				System.out.println("color in f2");
			}
		};
		f2.color();
		fan f3 = new fan() {
			
		};
		f3.color();
		fan f4 = new fan() {
			public void color() {
				System.out.println("color in f4");
			}
		};
		f4.color();
		
		fan f5 = new fan() {
			public void color() {
				System.out.println("color in f5");
				display();
			}
			
			public void display() {
				System.out.println("display in f5");
			}
		};
		
		f5.color();

	}

}

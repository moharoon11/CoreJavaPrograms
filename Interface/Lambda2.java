package Interface;

class Color {
	public void show() {
		System.out.println("show in color class");
	}
	
	public void disp() {
		System.out.println("disp in color");
	}
}

class Yellow extends Color {
	
	// in herited
}

@FunctionalInterface
interface hero {
	
	void power(int power);
}

class Batman implements hero {
	public void power(int power) {
		System.out.println("power in batman");
	}
}
public class Lambda2 {

	public static void main(String[] args) {
		
		Color c = new Yellow() {
			 //if nor overrided it get inheirted
			@Override
			public void show() {
				System.out.println("show in annony inner class");
			}
			
		};
		
		Color color = new Yellow();
		color.show();
		color.disp();
		
		
		c.show();
		c.disp();
		
		hero h  = (power) -> System.out.println("power in annony inner " + power);
		h.power(1000);
		
	
	
		
	}
}

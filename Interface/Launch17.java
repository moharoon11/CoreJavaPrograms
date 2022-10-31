package Interface;

interface I1{
	
	default void getGreetings() {
		System.out.println("Greetings in I1");
	}
	
}

interface I2 {
	default void getGreetings() {
		System.out.println("Greetings in I2");
	}
	
	
}
public class Launch17 implements I1, I2{

	
	public static void sub() {
		
	}
	public static void main(String[] args) {
		
		new Launch17().getGreetings();
	
		
	}

	@Override
	public void getGreetings() {
		
		I1.super.getGreetings();
	}
	


}

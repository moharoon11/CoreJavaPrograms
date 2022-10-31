package WrapperClasses2;

class AutoBoxingUnBoxing
{
	static Integer K = 10;
	public void example1() {
		// compiler will make the following changes
		// valid form jdk 1.5
		Integer I = 10; // --> bts -> Integer.valueOf(10);
		// converting primitive to wrapper is called AutoBoxing
		
		
		// compiler will make the following changes
		// bts --> I.intValue();
		int i = I;
		// converting wrapper to primitive is called AutoUnBoxing
	}
	static Integer H = null; //Integer.valueOf(null);
	public static void example2() {
		
		int h = H; // H.intValue(); --> NullpointerException
	}
}
public class LaunchAutoBoxingUnBoxing {

	static Integer I = 20; // AutoBoxing
	public static void main(String[] args) {
		
		int i = I; // AutoUnboxing
		System.out.println(I);
		System.out.println(i);
		
		// AutoBoxingUnBoxing.example2(); --> NullpointerException
	

	}

}

package WrapperClasses2;

class Wrapper4 
{
	
	public static void example1() {
		
	// String and all wrapper classes are immutable
	// then if we try to make a change it will not change in same object
	// it will create another object
	Integer x = 10; // Integer.valueOf(10);
	Integer y = x; // Integer.valueOf(x);
	System.out.println(x == y); // compares reference
	
	x++;
	System.out.println(x);
	System.out.println(y);
	System.out.println(x == y);
	
	Integer A = 78; 
	Integer B = 78;
	
	System.out.println("the output is : " + (A == B));
	
	Integer C = 45;
	Integer D = Integer.valueOf(45);
	System.out.println("C == D : " + (C == D));
	
	Integer E = Integer.valueOf(65);
	Integer F = Integer.valueOf(65);
	System.out.println("E == F : " + (E == F));
	
	Integer Y = new Integer(20);
	Integer Z = new Integer(20);
	System.out.println("Y == Z : " + (Y == Z));
	
	
	}
	

	
}
public class LaunchWrapper4 {

	public static void main(String[] args) {
		Wrapper4.example1();

	}

}

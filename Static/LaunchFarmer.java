package Static;

import java.util.Scanner;

class Farmer{
	
	private float pa;
	private int td;
	private float si;
	private static float ri;
	
	static {
		ri = 2.5f;
	}
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear, Kindly enter loan amount needed");
		pa=scan.nextFloat();
		System.out.println("Dear, Kindly enter time needed to repay");
		td= scan.nextInt();
		compute();
		disp();
	}
	
	public void compute() {
		si = (pa * td * ri) / 100;
	}
	
	public void disp() {
		System.out.println(si);
	}
}

public class LaunchFarmer {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		f1.acceptInput();
	
		
		Farmer f2 = new Farmer();
		f2.acceptInput();
		

	}

}

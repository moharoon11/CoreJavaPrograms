package Static;


class Helper{
	
	static void disp1() {
		System.out.println("static method disp1");
	}
	
	void disp2() {
		System.out.println("non static method disp2");
	}
	
	
}
public class Launch3 {

	public static void main(String[] args) {
	  Helper.disp1();
	  // Helper.disp2();
	  Helper h = new Helper();
	  h.disp1();
	  h.disp2();
	  
	  
		

	}

}

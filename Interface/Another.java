package Interface;

interface Left{
	
	default void m1() {
		System.out.println("m1 in left");
	}
	
	default void m2() {
		
	}
	default void m3() {
		
	}
	
}

interface Right{
	
	default void m1() {
		System.out.println("m1 in right");
	}
	
	default void m2() {
		
	}
	
}

class Both implements Left, Right{

   @Override
    public void m1() {
	   Left.super.m1();
	   Right.super.m1();
   }
   
   @Override
   public void m2() {
	   
   }
   
   
	
}
public class Another {

	public static void main(String[] args) {
		Both l = new Both();
		l.m1();
		l.m2();
		
		

	}

}

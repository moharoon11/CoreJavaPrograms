package Inheritance;

class Telusko {
	
	public Telusko show() {
		return new Telusko();
	}
	

}

class Alien extends Telusko{
	
	public Alien show() {
		return new Alien();
	}
	
	
	
	
}
class a {
	
	public static void disp() {
		System.out.println("static method in parent");
	}
	
	public void show() {
		System.out.println("show in parent");
	}
}

class b extends a {
	 
   public static void disp() {
	   System.out.println("specilaizzed static method in child");
   }
   
   public void show() {
	   System.out.println("show in child");
   }
	
	
}
public class Launch {

	public static void main(String[] args) {
		// a aa = new b();
	//	a.disp();
		
		b g = new b();
		g.show();
		
		a h = new b();
		h.show();
		
		a j = new a();
		j.show();
		
		
        
	}

}

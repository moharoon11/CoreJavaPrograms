package IS_A_relationship;

class Telusko{
	
	public static void disp() {
		System.out.println("Telusko is parent");
	}
	
	public void show() {
		System.out.println("telusko show method");
	}
}

class Alien extends Telusko{
	
	
	public static void disp() {
		System.out.println("Alien is child");
	}
}





public class Launch2 {

	public static void main(String[] args) {
		Alien a = new Alien();
		a.disp();
		a.show();
		
		Telusko t = new Alien();
		t.disp();
		t.show();

	}

}

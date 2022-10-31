package IS_A_relationship;

class Plane{
	   protected Plane fly() {
		System.out.println("Plane is flying");
		Plane p = new Plane();
		return p;
	}
	   
	   private void takeOff() {
		   System.out.println("plane is takeOff");
	   }
	   
	   public void radar() {
		   System.out.println("Plane has radar");
	   }
}

class CargoPlane extends Plane{
	    public CargoPlane fly() {
		System.out.println("cargo plane flies at lower level");
		CargoPlane p = new CargoPlane();
		return p;
				
	}
}

public class Launch1 {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.fly();
		// cp.takeOff(); --> private methods not involved in inheritance
		cp.radar();
   }

}

package IS_A_relationship;


class Plane1{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
}

class CargoPlane1 extends Plane1{
	public void fly()
	{
		System.out.println("Cargo plane flies at lower height");
		
	}
	public void takeOff()
	{
		System.out.println("Cargo plane requires longer runway to take off");
	}
	
	public void scanner() {
		System.out.println("scanner in cp");
	}
}

class PassengerPlane1 extends Plane1{
	public void fly()
	{
		System.out.println("Passenger plane flies at medium height");
		
	}
	public void takeOff()
	{
		System.out.println("Passenger plane requires medium size runway runway to takeOff");
	}
	
	public void radar() {
		System.out.println("radar in pp");
	}
}

class FighterPlane1 extends Plane1{
	public void fly()
	{
		System.out.println("Fighter plane flies at high height");
		
	}
	public void takeOff()
	{
		System.out.println("Fighter plane requires short runway to takeOff");
	}
	
	public void shooter() {
		System.out.println("shooter in fp");
	}
}

class Airport{
	
	public void permit(Plane1 p) {
		p.takeOff();
		p.fly();
	}
	
	public void permit(Plane1[] planes) {
		 for(Plane1 plane:planes) {
			 plane.takeOff();
			 plane.fly();
		 }
	}
}



public class Launch3 {

	public static void main(String[] args) {
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		
		Airport a = new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		System.out.println("*************************************************");
		Plane1[] plane  = new Plane1[3];
		plane[0] = cp;
		plane[1] = pp;
		plane[2] = fp;
		
		a.permit(plane);
		
		
		
		
//		Plane1 p1;
//		
//		p1 = cp;
//		
//		p1.fly();
//		p1.takeOff();
//		
//		p1 = pp;
//		p1.fly();
//		p1.takeOff();
//		
//		p1 = fp;
//		p1.fly();
//		p1.takeOff();
//         
	}

}

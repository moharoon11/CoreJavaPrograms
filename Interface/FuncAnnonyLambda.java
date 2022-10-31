package Interface;

abstract class cities {
	public abstract void name();
}

class get extends cities {
	public void name() {
		System.out.println("name in get");
	}
	
	public void famousFor() {
		System.out.println("famous for in get");
	}
}
public class FuncAnnonyLambda {

	public static void main(String[] args) {
		cities city = new get();
		city.name();
		
		cities c = new cities() {
			public void name() {
				System.out.println("name in annony inner from abstract");
			}
		};
		
		c.name();
		
		get gets = new get() {
			public void name() {
				System.out.println("name in annny inner from normal class");
			}
		};
		gets.name();
		gets.famousFor();
		
		// lambda exp are possible for only functional interface
//		cities lam = () ->{
//			System.out.println("name in lambda with abstract class");
//		};
//		

	}

}

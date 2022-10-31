package Static;


class Alien{
	  
	private String name;
	private int age;
	
	static private int count;
	
	public static int getCount(){
	   return count++;
	}
	
	{
	  getCount();
	}
	
	Alien(){
		
	}
	
	Alien(String name){
		this.name = name;
	}
	
	Alien(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Alien(int age){
		this.age = age;
	}
	
}

public class Launch4 {

	public static void main(String[] args) {
		
		Alien a = new Alien();
		Alien b = new Alien("name",12);
		Alien c = new Alien("name");
		Alien d = new Alien(15);
		Alien e = new Alien(17);
		Alien f = new Alien("name",12);
		
		System.out.println(Alien.getCount());
	

	}

}

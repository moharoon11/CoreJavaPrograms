package WrapperClasses;


class Student {
	
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
		
	}
}
class Ts {
	
	public void test() {
		
		
		String name = new String("name");
		System.out.println(name);
		
		
	}
}

public class ToString {

	public static void main(String[] args) {
	
		Ts ts = new Ts();
		ts.test();
		
		Student s1 = new Student("haroon");
		System.out.println(s1);

	}

}

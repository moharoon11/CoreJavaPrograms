package Inheritance;


class Parent{
	
	
	public void speak() {
		System.out.println("Parent is speaking");
	}
	
	public void walking() {
		System.out.println("Parent  walks early moring to do exercises");
	}
	
	public void eating() {
		System.out.println("Parent  eats healthy food");
	}
}

class Child extends Parent{
	public void speak() {
		System.out.println("child is speaking");
	}
	
	public void walking() {
		System.out.println("child sleeps till 9 am daily");
	}
	
	public void eating() {
		System.out.println("child eats fast food");
	}
	
	public void developer() {
		System.out.println("child is a app developer");
	}
	
	
}

public class CastingInInheritance {

	public static void main(String[] args) {
		Child c1 = new Child();
		Parent p1 = new Child(); // upcasting is possible
		
		p1.walking();
		p1.eating();
		p1.speak();
		((Child)p1).developer(); // downcasting
		
		/**
		Child c2 =(Child) new Parent(); -->class cast exception
		c2.eating();
		**/
        
	}

}

import java.util.*;

class Student extends Object{
	
	String name;
	Student(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}

public class Demo {

	
	public static void main(String[] args) {
	   
		String name= new String("Sameer");
		System.out.println(name); // 
		
		Student s=new Student("zebra");
		System.out.println(s);
		
		String d1="date";
		String d2="date";
		
		
		
      
	}
	
	

}

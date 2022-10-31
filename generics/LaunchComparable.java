package generics;
import java.util.*;

class Student implements Comparable<Student>{
	
	private String name;
	private Integer age;
	private String tech;
	
	public Student(String name,Integer age,String tech) {
		this.name=name;
		this.age=age;
		this.tech=tech;
	}
	
	@Override
	public String toString() {
		return "Student [age="+age+",name="+name+",tech="+tech+"]"; 
	}

	@Override
	public int compareTo(Student that) {
		// return this.age - that.age;
		// return this.name.compareTo(that.name);
	    // return this.name.length() - that.name.length();
		return this.tech.charAt(1) - that.tech.charAt(1);
	}
	
	
}
public class LaunchComparable {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Haroon",19,"java"));
		al.add(new Student("Manoj",17,"Web Development"));
		al.add(new Student("Elon musk",45,"Ai/Ml"));
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		List<Integer> a=Arrays.asList(1,2,3,4);
		
		a.stream().filter(n -> n%2==0).map
		
		
		
			
		
		
		

	}

}

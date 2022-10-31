package HAR_ONE_ONE_ASSOCIATION;

// Target Object
public class Student  {

	 // Instance Variable
	 private String name;
	 private String courseTaken;
	 private Integer fessPaid;
	 
	 // HAS-A Variable Injection
	 Teacher teacher;
	 private Address[] address;
	 
	public Student(String name, String courseTaken, Integer fessPaid, Teacher teacher,
			Address[] address) {
		this.name = name;
		this.courseTaken = courseTaken;
		this.fessPaid = fessPaid;
		this.teacher = teacher;
		this.address = address;
	}
	
	
	public void display() {
		System.out.println("Student details");
		System.out.println(name);
		System.out.println(courseTaken);
		System.out.println(fessPaid);
		System.out.println("-------------------------------");
		System.out.println("Teacher Details");
		System.out.println(teacher.getName());
		System.out.println(teacher.getProfession());
		System.out.println(teacher.getFess());
		
		for(Address address : address) {
			System.out.println(address.getCity());
			System.out.println(address.getDoorNo());
			System.out.println(address.getStreet());
		}
		
		
	}
	 
	 
	 
	 
	 
	 
}

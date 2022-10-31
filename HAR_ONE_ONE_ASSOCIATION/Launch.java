package HAR_ONE_ONE_ASSOCIATION;

public class Launch {

	public static void main(String[] args) {
		//Dependant for teacher
		Address add1 = new Address("123", "UG Street", "Bengaluru");
		Address add2 = new Address("345", "Play Street", "Chenni");
		
		Address[] address = new Address[2];
		address[0] = add1;
		address[1] = add2;
		
		// Creating the "Dependant Object"
		Teacher teacher = new Teacher("Hyder Abbas", "Java Developer", 4000);
		
		// Initializing the dependent object into Target Object
		Student student = new Student("Haroon", "java fullstack with spring boot",
				  4000, teacher, address);
		
		student.display();
		
		  

	}

}

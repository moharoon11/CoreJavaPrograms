package HAR_MANY_ONE;

public class Launch {

	public static void main(String[] args) {
		
	Students s1 = new Students();
	Students s2 = new Students();
	Students s3 = new Students();
	
	s1.setName("Mohammed Haroon");
	s2.setName("Sri Haran");
	s3.setName("Mugesh Raja");
	
	s1.setRollNo(116);
	s2.setRollNo(124);
	s3.setRollNo(217);
	
	
	Students[] students = new Students[3];
	students[0] = s1;
	students[1] = s2;
	students[2] = s3;
	
	Department department = new Department();
	department.setName("INFORMATION TECHNOLOGY - (BSC - IT)");
	department.setNo(12);
	department.setStaffs(8);
	department.setStudent(students);
	department.display();
	
	
	}

}

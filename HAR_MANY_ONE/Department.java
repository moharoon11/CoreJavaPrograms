package HAR_MANY_ONE;

public class Department {

	
	private String name;
	private Integer no;
	private Integer staffs;
	
	// HAS-A Variable Injection
	Students[] students;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public void setStaffs(Integer staffs) {
		this.staffs = staffs;
	}
	public void setStudent(Students[] students) {
		this.students = students;
	}
	
	public void display() {
		int count = 0;
		System.out.println("Department Details");
		System.out.println("--------------------------------------");
		System.out.println(name);
		System.out.println(no);
		System.out.println(staffs);
		System.out.println("--------------------------------------");
		System.out.println("Student Details");
		for(Students student : students) {
			count += 1;
			System.out.println("Student " + count);
			System.out.println(student.getName());
			System.out.println(student.getRollNo());
			System.out.println("---------------------");
		}
		
	}
	
	
	
	
	
}

package HAR_ONE_ONE_ASSOCIATION;

// Dependant Object
public class Teacher {

	// Instance Variable
	private String name;
	private String profession;
	private Integer fess;
	
	
	
	

	

	// inserting primitive values through constructor injection in Dependant Object 
	public Teacher(String name, String profession, Integer fess) {
		this.name = name;
		this.profession = profession;
		this.fess = fess;
		
	}

	// getter methods
	public String getName() {
		return name;
	}

	public String getProfession() {
		return profession;
	}

	public Integer getFess() {
		return fess;
	}
	
	
	
	
	
}

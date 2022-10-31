package HAR_MANY_ONE;

// Dependant Object
public class Students {

	 private String name;
	 private Integer rollNo;
	
	 // Initializing the dependent object through setter injection
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	 
	
	// getters to get the values
	public Integer getRollNo() {
		return rollNo;
	}
	 
	
	public String getName() {
		return name;
	}
}

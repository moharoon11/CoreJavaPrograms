package Static;

import java.util.Scanner;

class CollegeStudents{
	Scanner in = new Scanner(System.in);
	// Students input
	
	
	public void giveInput() {
		sNationality = in.nextLine().toUpperCase();
		sState = in.nextLine().toUpperCase();
		sDistrict = in.nextLine().toUpperCase();
		sQualification = in.nextLine().toUpperCase();
		
		if(validateStudent()) {
			
			System.out.println("You are eligible to proceed further");
			
			
		}else {
			System.out.println("You are not validate candidate "
					+ "you can't proceed further");
			
		}
	}
	
	
	private String sNationality;
	private String sState;
	private String sDistrict;
	private String sQualification;
	
	private String sName;
	private String sSurName;
	private int sAge;
	private String sFatherName;
	private String sMotherName;
	private String sDob;
	private String sCurrentAddress;
	private String sCollegeName;
	private String sCourseName;
	private String sNoOfSem;
	
	// our needed things
	
	private int gFessProvided;
	private static int gOneSem;
	
	static {
		gOneSem = 12000;
	}
	

public boolean validateStudent() {

		
		if(	sNationality == "INDIAN" && 
				sState == "TAMILNADU" && 
				sDistrict == "MADURAI" &&
				sQualification == "SSLC") {
		
			return true;
			
		}else {
			
			return false;
		}
	}
	
	
	
	
}

public class LaunchFree {

	public static void main(String[] args) {
		CollegeStudents a = new CollegeStudents();
		a.giveInput();

	}

}

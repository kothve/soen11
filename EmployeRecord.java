
public class EmployeRecord extends Records {

	
	
	
	String firstName;
	String lastName;
	int employeeID;
	String mailID;
	String projectID;
	
	
	
	public EmployeRecord(String firstname, String lastName, int employeeID, String mailID, String projectID) {
		
		
		super("ER", firstname,  lastName,  employeeID,  mailID,  projectID);
		
	}

	
	
	
}

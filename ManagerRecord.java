
public class ManagerRecord extends Records {

	String firstName;
	String lastName;
	String employeeID;
	String mailID;
	String projectID;
	String clientName;
	String projectName;
	String location; //US, CA, UK
	String recordsID;
	
	
	
		

public ManagerRecord(String firstname, String lastName, String employeeID, String mailID, String projectID, String clientName, String ProjectName, String location) {
	
	//recordsID = "MR"+ Integer.toString(recordNumber);
	
	
	super("MR", firstname,  lastName,  employeeID,  mailID,  projectID,  clientName,  ProjectName,  location);
		
		
		
	}
	
	
	
	
	
}

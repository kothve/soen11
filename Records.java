import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.sql.Timestamp;


public class Records {
	
	
	
	
	
	
	
	static int recordNumber =1000;
	int numberOfRecords = 0;
	String recordsID;
	
	String firstName;
	String lastName;
	String employeeID;
	String mailID;
	String projectID;
	String clientName;
	String projectName;
	String location;//US, CA, UK
	
	
	
	public Records(String recordPrefix ,String firstname, String lastName, String employeeID, String mailID, String projectID, String clientName, String projectName, String location) {
		
		//a way to get recordNumber;
		numberOfRecords++;
		
		
		
		
		
		recordsID = recordPrefix+Integer.toString(recordNumber);
		recordNumber = numberOfRecords + recordNumber;
		
		
		this.firstName = firstname;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.mailID = mailID;
		this.projectID = projectID;
		this.clientName = clientName;
		this.projectName = projectName;
		this.location = location;
		
		
	}
	
	
public Records(String recordPrefix ,String firstname, String lastName, String employeeID, String mailID, String projectID) {
		
		//a way to get recordNumber;
		
	recordsID = recordPrefix+Integer.toString(recordNumber);	
	this.recordNumber++;	
		
	this.firstName = firstname;
	this.lastName = lastName;
	this.employeeID = employeeID;
	this.mailID = mailID;
	this.projectID = projectID;
	this.clientName = "";
	this.projectName = "";
	this.location = "";
		
		
	}


public void display() {
	
	System.out.println(	recordsID + firstName +	 lastName +	 employeeID + mailID + projectID + clientName + projectName + location);
	
	
}

public String display_String() {
	
	return	recordsID +"  " + firstName +"  " +	 lastName +"  " +	 employeeID +"  " + mailID +"  " + projectID +"  " + clientName +"  " + projectName +"  " + location;
	
	
}


public void MR_printToLogs(int App) {
	
	
	
	
	try
	{
		String filename;
		
		if(App == 0) {
			
			 filename= "CA_CenterServer_logs.txt";
			
		}
		else {
			
			 filename= "CA_Client_logs.txt";
		}
		
		
	    
	    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
	    fw.write("\n\n----------"+getTimeStamp()+"----------\n"+
	    		"Successfuly added Manager Record:\n"+
	    		display_String() +"\n"+
	    		"----------"+getTimeStamp()+"----------\n\n"
	    		
	    		
	    		);//appends the string to the file
	    
	    
	    
	    
	    
	    
	    
	    fw.close();
	}
	catch(IOException ioe)
	{
	    System.err.println("IOException: " + ioe.getMessage());
	}	
	
}




public String getTimeStamp()
{
String timeStamp;
Date date= new Date();

long time = date.getTime();
Timestamp ts = new Timestamp(time);
timeStamp = ts.toString();
		

return timeStamp;
}
	
	
	

}

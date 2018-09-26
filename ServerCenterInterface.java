// file: SomeInterface.java 
// to be implemented by a remote object.

import java.rmi.*;

public interface ServerCenterInterface extends Remote {
	// signature of first remote method
   
	public  String createMRecord( String  firstName, String lastName, int employeeID, String  mailID, String projectID, String clientName, String projectName, String location) 
	   throws java.rmi.RemoteException;
   // signature of second remote method
   
   
   
	public int getRecordCounts()  				
      throws java.rmi.RemoteException;
	
	public String createERecord(String firstName, String lastName, int employeeID, String mailID, String projectID,String location) 
			throws java.rmi.RemoteException;
	
	
	public String editRecord(String recordID, String fieldName, String newValue)
			throws java.rmi.RemoteException;
} // end interface

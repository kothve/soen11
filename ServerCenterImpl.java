import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * This class implements the remote interface SomeInterface.
 */

public class ServerCenterImpl extends UnicastRemoteObject
   implements ServerCenterInterface {
	
	static int numberOfRecords = 3;
    int counter = 0;
	
	HashMap<Character, ArrayList<Records>> database;
	
	
	
  
	public ServerCenterImpl(HashMap<Character, ArrayList<Records>> database) throws RemoteException {
	      super( );
	      this.database = database;
	   }
  
   public String createMRecord(String firstName, String lastName, String employeeID, String mailID, String projectID, String clientName, String projectName, String location) throws RemoteException {
	 
	   String  success = "Has been added to DB!!!";
	   String error;
	   
	   
	   char dbCharacter = Character.toLowerCase(lastName.charAt(0));
	   
	   
	   
		   Records recordCreated = new Records("MR", firstName, lastName, employeeID,  mailID, projectID,  clientName,projectName, location);
	   
		   Set<Character> keySet = database.keySet();
		   
		   java.util.Iterator<Character> keySetIterator = keySet.iterator();
		   while (keySetIterator.hasNext()) {
			   
			   
			   Character key = keySetIterator.next();
			   if (dbCharacter == key) {
				   
				   database.get(key).add(recordCreated);
				   recordCreated.MR_printToLogs(0);
				   
				    
			   }			   						   
		   }
		   		   		   	   
	   numberOfRecords++;
       counter = numberOfRecords;
       
       
       
                 	   	   
	return success;	   	
   }
   
   
   
   
   

   public int getRecordCounts() throws RemoteException {
	return 0;
      // code to be supplied
   }

   
   
   
   
   
   public String createERecord(String firstName, String lastName, String employeeID, String mailID, String projectID, String location) throws RemoteException {
		return null;
	
	   }
   
   public String editRecord(String recordID, String fieldName, String newValue) throws RemoteException {
	   
	   
	   return null;
	   
   }
   
   
   
   
   
   
   
   
   
   
} //end class

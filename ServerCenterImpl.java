import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;



/**
 * This class implements the remote interface SomeInterface.
 */

public class ServerCenterImpl extends UnicastRemoteObject
   implements ServerCenterInterface {
	
	String location;
	static int numberOfRecords = 3;
    int counter = 0;
	
	 HashMap<Character, ArrayList<Records>> database;
	
	
	
  
	public ServerCenterImpl() throws RemoteException {
	      super( );
	      HashMap<Character, ArrayList<Records>> database  = new HashMap();	  
	      
	      
	      //put 3 records inside database
	     ArrayList<Records> addNewArray1 = new ArrayList<Records>();
	     ArrayList<Records> addNewArray2 = new ArrayList<Records>();
	     
	    database.put('m', addNewArray1);   	     
	    database.get('m').add(new Records( "MR" , " Olivier ", 	" Mercier-Peetz ",	 27181000  , " oliviermercierpeetz@live.ca ", " P1232132 ", " UofConcordia ", " A1 " ," Montreal"));
		database.get('m').add(new Records( "MR" , " Karen ", 	" Marquez ",	 21232123  , " km@live.ca ", " P123213 ", " UofConcordia ", " A1 " ," Montreal"));		
		database.put('p', addNewArray2);
		database.get('p').add(new Records( "ER" , " Uwe ", 	" Peetz ",	 2122323  , " uwe-p@live.ca ", "P10001"));
	     //3 records inside hashmap
	       
	      
	      
	      this.database = database;
	      
	 
	      
	      
	   }
	
  
   public String createMRecord(String firstName, String lastName, int employeeID, String mailID, String projectID, String clientName, String projectName, String location) throws RemoteException {
	 
	   String  success = "Has been added to DB!!!";
	   String error;
	   
	   
	   char dbCharacter = Character.toLowerCase(lastName.charAt(0));
	   
	   
	   
		   Records recordCreated = new Records("MR", firstName, lastName, employeeID,  mailID, projectID,  clientName,projectName, location);
	   
		   Set<Character> keySet = this.database.keySet();
		   
		   java.util.Iterator<Character> keySetIterator = keySet.iterator();
		   
		   
		   
		   if(this.database.containsKey(dbCharacter)) {
			   
			   
		   
		   while (keySetIterator.hasNext()) {
			   
			   
			   Character key = keySetIterator.next();
			   if (dbCharacter == key) {
				   
				   this.database.get(key).add(recordCreated);
				   recordCreated.MR_printToLogs(0);
				   
				    
			   }
			   
		   }
   }else {
	   
	   ArrayList<Records> addNewArray = new ArrayList<Records>();
	   
	   this.database.put(dbCharacter, addNewArray);
	   this.database.get(dbCharacter).add(recordCreated);
	
	   
	   
   }
		   		   		   	   
	   numberOfRecords++;
       counter = numberOfRecords;
       
       
       
                 	   	   
	return success;	   	
   }
   
   
   
   
   

   public int getRecordCounts() throws RemoteException {
	return 0;
      // code to be supplied
   }

   
   
   
   
   
   public String createERecord(String firstName, String lastName, int employeeID, String mailID, String projectID, String location) throws RemoteException {
		return null;
	
	   }
   
   public String editRecord(String recordID, String fieldName, String newValue) throws RemoteException {
	   
	   
	   return null;
	   
   }
   
   public void printData(){
	   
	   	
			System.out.println("Size of HashMap : " + database.size());
			
			
			//ArrayList<Records> test1 = new ArrayList<Records>();
			//test1 = database.get('m');
			
			
			
			Iterator it =  this.database.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        
		    }
	   
	   
	   
	   
   }






   
   
   
   
   
   
   
   
} //end class

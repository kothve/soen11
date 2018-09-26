import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.rmi.registry.LocateRegistry;

/**
* This class represents the object client for a distributed
* object of class SomeImpl, which implements the remote 
* interface SomeInterface.
*/

public class Client {
   public static void main(String args[]) throws UnknownHostException {
	   getCentralServerIP();
	   Scanner scanner = new Scanner( System.in );
	   
	   while(true) {
		   
		   
	   
	   
	   
	   System.out.println("Please input your manager ID");
	   
	   String manager_ID = scanner.next();
	   String manager_Location = manager_ID.substring(0, 2).toUpperCase();
	   
	   if(validate_ID(manager_Location)) {
		   
		   
		   
		   
		   String firstName;
		   String lastName;
		   int employeeID;
		   String mailID;
		   String projectID;
		   String clientName;
		   String projectName;
		   String location;
		   System.out.println("Select one of the following options:\n");
		   System.out.println("1. Create a manager record.\n2. Create an employe record.\n3. Get the total number of records from all CenterServers.\n4. Edit a record.\n ");
		   int option = scanner.nextInt();
		   
		   
		   
		   switch (option) {
           case 1:  System.out.println("createMRecord(String firstName, String lastName, int employeeID, String mailID, String projectID, String clientName, String projectName, String location)");
                    break;
                    
           case 2:  System.out.println("createERecord(String firstName, String lastName, int employeeID, String mailID, String projectID, String location)");
                    break;
                    
                    
                    
                    
                    
                    
           case 3:  
                    break;
           case 4:  
                    break;
		   
		   
		   
		   
		   
		   		   
	   }
	  
	   
	   
	   
	   
   }
	   }   
	   
	   
	   
	   
	   
	   
	//System.out.println(getIPAdress());
	   
	   
	
	
	
	
	   
	   /*
      try {
         int RMIPort;         
        	String hostName;
         String portNum;
        	// Code for obtaining hostName and RMI Registry port 
       	// to be supplied.

         // Look up the remote object and cast its reference 
         // to the remote interface class -- replace "localhost"
         // with the appropriate host name of the remote object.
			String registryURL = 
				"rmi://localhost:" + portNum + "/registry";  
		//SomeInterface h =
          	//(SomeInterface)Naming.lookup(registryURL);
         // invoke the remote method(s)
        // String message = h.method1();
      //  System.out.println(message);
         // method2 can be invoked similarly
      } // end try 
      catch (Exception ex) {
         ex.printStackTrace( );
      } // end catch*/
   } //end main
   // Definition for other methods of the class, if any.
   
   
   public static String getIPAdress() throws UnknownHostException {
	   
	   InetAddress inetAddress;
	   
		
			inetAddress = InetAddress.getLocalHost();
			String ip = inetAddress.getHostAddress();
			return ip;
		
		

	   
   }
   
   
   
   public static boolean validate_ID(String ID) {
		   
	   if(ID.equals("CA") || ID.equals("US") || ID.equals("UK")) {		  
		  System.out.println("Manager ID is valid");
		   return true;		   
	   }			   
	   else {		   
		   System.out.println("Manager ID is invalid, please try again!");		   
		   return false;
	   }
		
	}
   
   
   public static void getCentralServerIP() {
	   
	   
	   try {
	         int RMIPort;         
	        	String hostName;
	         String portNum;
	        	// Code for obtaining hostName and RMI Registry port 
	       	// to be supplied.

	         // Look up the remote object and cast its reference 
	         // to the remote interface class -- replace "localhost"
	         // with the appropriate host name of the remote object.
				String registryURL = 
					"rmi://localhost:" + 3333 + "/registry";  
				RegistryInterface R =
				     	(RegistryInterface)Naming.lookup(registryURL);
	         // invoke the remote method(s)
				System.out.println("CA Server Center IP is "+ R.CA());
				System.out.println("CA Server Center IP is "+ R.US());
				System.out.println("CA Server Center IP is "+ R.UK());
	         // method2 can be invoked similarly
	      } // end try 
	      catch (Exception ex) {
	         ex.printStackTrace( );
	      } // end catch*/
	   
	   
	       
	    
	   
   }
   
   
   
   
   
   
}//end class
   
   

import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.net.UnknownHostException;
import java.io.*;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This class represents the object server for a distributed
 * object of class SomeImpl, which implements the remote 
 * interface SomeInterface.
 */

public class ServerCenter  {
   public static void main(String args[]) throws RemoteException {
	   
	   //number of records
	   int numberOfRecords =3;
	   
	   
	   /*
	   //initializes Database
	   HashMap<Character, ArrayList<Records>> database = createHashMap();
	   
	   
	   database.get('m').add(new Records( "MR" , " Olivier ", 	" Mercier-Peetz ",	" 27181000 " , " oliviermercierpeetz@live.ca ", " CompSci ", " UofConcordia ", " A1 " ," Montreal"));
	   database.get('m').add(new Records( "MR" , " Karen ", 	" Marquez ",	" 21232123 " , " km@live.ca ", " Communication ", " UofConcordia ", " A1 " ," Montreal"));
	   database.get('p').add(new Records( "ER" , " Uwe ", 	" Peetz ",	" 2122323 " , " uwe-p@live.ca ", "P10001"));
	   
	   
	   
	   //testing
	   */
	   
		ServerCenterImpl testing = new ServerCenterImpl();
		testing.printData();
		testing.printData();
		testing.createMRecord("Sugar", "Rashad", 1232131, "rashad@live.ca", "testing", "UofConcordia", "A1", "USA");
		testing.printData();
		
		
		
	
	   
	   
	   
	   
	   
	   
	   
	 //Register IP of host to CentralRegistry/////////////////////
	   
	   try {
		 
	   String hostIP = getIPAdress();//gets IP of HOST from method 
	   
	   
	   
	   int RMIPort;         
   	String hostName;
    String portNum = "3333";
   	// Code for obtaining hostName and RMI Registry port 
  	// to be supplied.

    // Look up the remote object and cast its reference 
    // to the remote interface class -- replace "localhost"
    // with the appropriate host name of the remote object.
		String registryURL = 
			"rmi://localhost:" + portNum + "/registry";
		System.out.println("Lookup completed " );
	RegistryInterface R =
     	(RegistryInterface)Naming.lookup(registryURL);
    // invoke the remote method(s)
	System.out.println("Lookup completed " );
     R.updateCA(hostIP);
   System.out.println("CA Server Center IP is "+ R.CA());
    // method2 can be invoked similarly
	   
	   
	   
	   
	   
	   
	   
	   }
	   catch (Exception re) {
	         System.out.println(
	            "Exception in SomeServer.main: " + re);
	      } // end catch  
	 
	   
	   //////////////////////////////////////
	   
	   
	   
	   
	   
	   /////////////////////////////////////
	   
      String portNum = "1234", registryURL;
      try{   
 		   // code for obtaining RMI port number value omitted
    	  ServerCenterImpl exportedObj = new ServerCenterImpl();
    	  
         startRegistry(1234);
         // register the object under the name "some"
         registryURL = "rmi://localhost:" + portNum + "/CAcenterServer";
         Naming.rebind(registryURL, exportedObj);
         System.out.println("Some Server ready.");
      }// end try
      catch (Exception re) {
         System.out.println(
            "Exception in SomeServer.main: " + re);
      } // end catch 
  } // end main

   // This method starts a RMI registry on the local host, if it
   // does not already exist at the specified port number.
   private static void startRegistry(int RMIPortNum)
      throws RemoteException{
      try {
         Registry registry = LocateRegistry.getRegistry(RMIPortNum);
         registry.list( );  
			// The above call will throw an exception
         // if the registry does not already exist
      }
      catch (RemoteException ex) {
         // No valid registry at that port.
         System.out.println(
            "RMI registry cannot be located at port " 
            + RMIPortNum);
         Registry registry = LocateRegistry.createRegistry(RMIPortNum);
         System.out.println(
            "RMI registry created at port " + RMIPortNum);
      }
   } // end startRegistry
   
   
   
 //get IP address  
public static String getIPAdress() throws UnknownHostException {
	   
	   InetAddress inetAddress;
	   
		
			inetAddress = InetAddress.getLocalHost();
			String ip = inetAddress.getHostAddress();
			return ip;
		

	   
   }





	
    

   
   
   
     
} // end class

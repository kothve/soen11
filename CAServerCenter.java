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

public class CAServerCenter  {
   public static void main(String args[]) throws RemoteException {
	   
	   //number of records
	   int numberOfRecords =3;
	   
	   
	   
	   //initializes Database
	   HashMap<Character, ArrayList<Records>> database = createHashMap();
	   
	   
	   database.get('m').add(new Records( "MR" , " Olivier ", 	" Mercier-Peetz ",	" 27181000 " , " oliviermercierpeetz@live.ca ", " CompSci ", " UofConcordia ", " A1 " ," Montreal"));
	   database.get('m').add(new Records( "MR" , " Karen ", 	" Marquez ",	" 21232123 " , " km@live.ca ", " Communication ", " UofConcordia ", " A1 " ," Montreal"));
	   database.get('p').add(new Records( "ER" , " Uwe ", 	" Peetz ",	" 2122323 " , " uwe-p@live.ca ", "P10001"));
	   
	   
	   
	   //testing
	   
	   
		ServerCenterImpl testing = new ServerCenterImpl(database);
		System.out.println(testing.createMRecord("Sugar", "Rashad", "1232131", "rashad@live.ca", "testing", "UofConcordia", "A1", "USA"));
		displayDatabase(database);
		
		
		
	
	   
	   
	   
	   
	   
	   
	   
	 //Register IP of host to CentralRegistry/////////////////////
	   
	   try {
		String serverName =   "CAserver";
	   String CentralRegistryIp = "192.168.0.191"; 
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
			"rmi://192.168.0.191:" + portNum + "/registry";
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
    	  ServerCenterImpl exportedObj = new ServerCenterImpl(database);
    	  
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

//create database and fill it

public static HashMap<Character, ArrayList<Records>> createHashMap() {
	
	HashMap<Character, ArrayList<Records>> database = new HashMap();
	
	ArrayList<Records> a = new ArrayList<Records>();
	database.put('a', a);
	
	
	ArrayList<Records> b = new ArrayList<Records>();
	database.put('b', b);
	
	ArrayList<Records> c = new ArrayList<Records>();
	database.put('c', c);
	
	ArrayList<Records> d = new ArrayList<Records>();
	database.put('d', d);
	
	
	ArrayList<Records> e = new ArrayList<Records>();
	database.put('e', e);
	
	ArrayList<Records> f = new ArrayList<Records>();
	database.put('f', f);

	ArrayList<Records> g = new ArrayList<Records>();
	database.put('g', g);
	ArrayList<Records> h = new ArrayList<Records>();
	database.put('h', h);
	ArrayList<Records> i = new ArrayList<Records>();
	database.put('i', i);
	ArrayList<Records> j = new ArrayList<Records>();
	database.put('j', j);
	ArrayList<Records> k = new ArrayList<Records>();
	database.put('k', k);
	ArrayList<Records> l = new ArrayList<Records>();
	database.put('l', l);
	ArrayList<Records> m = new ArrayList<Records>();
	database.put('m', m);
	ArrayList<Records> n = new ArrayList<Records>();
	database.put('n', n);
	ArrayList<Records> o = new ArrayList<Records>();
	database.put('o', o);
	ArrayList<Records> p = new ArrayList<Records>();
	database.put('p', p);
	ArrayList<Records> q = new ArrayList<Records>();
	database.put('q', q);
	ArrayList<Records> r = new ArrayList<Records>();
	database.put('r', r);
	ArrayList<Records> s = new ArrayList<Records>();
	database.put('s', s);
	ArrayList<Records> t = new ArrayList<Records>();
	database.put('t', t);
	ArrayList<Records> u = new ArrayList<Records>();
	database.put('u', u);
	ArrayList<Records> v = new ArrayList<Records>();
	database.put('v', v);
	ArrayList<Records> w = new ArrayList<Records>();
	database.put('w', w);
	ArrayList<Records> x = new ArrayList<Records>();
	database.put('x', x);
	ArrayList<Records> y = new ArrayList<Records>();
	database.put('y', y);
	ArrayList<Records> z = new ArrayList<Records>();
	database.put('z', z);
	return database;
	
	
	
	
	
	
}


public static void displayDatabase(HashMap<Character, ArrayList<Records>> database) {
	
	
	System.out.println("Size of HashMap : " + database.size());
	ArrayList<Records> test1 = new ArrayList<Records>();
	test1 = database.get('m');
	
	
	
	Iterator it = database.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        
        if(pair.toString().length() > 10) {
        	
        	System.out.println(pair.getKey() + " = " +  pair.toString());	
        }
       
        it.remove(); // avoids a ConcurrentModificationException
    }
	
	
    
	
	
	
}


   
   
   
   
     
} // end class

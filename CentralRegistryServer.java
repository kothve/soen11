import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.net.UnknownHostException;
import java.io.*;

/**
 * This class represents the object server for a distributed object of class
 * SomeImpl, which implements the remote interface SomeInterface.
 */

public class CentralRegistryServer {
	public static void main(String args[]) throws UnknownHostException {

		String hostIP = getIPAdress();// gets IP of HOST from method

		String portNum = "3333", registryURL;
		try {
			// code for obtaining RMI port number value omitted
			RegistryImp exportedObj = new RegistryImp();

			startRegistry(1234);
			// register the object under the name "registry"
			registryURL = "rmi://localhost:" + portNum + "/registry";
			Naming.rebind(registryURL, exportedObj);
			System.out.println("Some Server ready.");
		} // end try
		catch (Exception re) {
			System.out.println("Exception in CentralRegistryServer.main: " + re);
		} // end catch
	} // end main

	// This method starts a RMI registry on the local host, if it
	// does not already exist at the specified port number.
	private static void startRegistry(int RMIPortNum) throws RemoteException {
		try {
			Registry registry = LocateRegistry.getRegistry(RMIPortNum);
			registry.list();
			// The above call will throw an exception
			// if the registry does not already exist
		} catch (RemoteException ex) {
			// No valid registry at that port.
			System.out.println("RMI registry cannot be located at port " + RMIPortNum);
			Registry registry = LocateRegistry.createRegistry(RMIPortNum);
			System.out.println("RMI registry created at port " + RMIPortNum);
		}
	} // end startRegistry

	// get IP address
	public static String getIPAdress() throws UnknownHostException {

		InetAddress inetAddress;

		inetAddress = InetAddress.getLocalHost();
		String ip = inetAddress.getHostAddress();
		return ip;

	}

} // end class

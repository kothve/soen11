
// file: SomeInterface.java 
// to be implemented by a remote object.

import java.rmi.*;

public interface RegistryInterface extends Remote {
	// signature of first remote method

	public String CA() throws java.rmi.RemoteException;
	// signature of second remote method

	public void updateCA(String ip) throws java.rmi.RemoteException;

	public String US() throws java.rmi.RemoteException;

	public void updateUS(String ip) throws java.rmi.RemoteException;

	public String UK() throws java.rmi.RemoteException;

	public void updateUK(String ip) throws java.rmi.RemoteException;

} // end interface

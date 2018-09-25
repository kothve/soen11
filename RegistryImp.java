import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;

public class RegistryImp extends UnicastRemoteObject implements RegistryInterface {
	String CA = "";
	String UK = "";
	String US = "";

	public RegistryImp() throws RemoteException {
		super();
	}

	public void updateCA(String ip) throws RemoteException {
		CA = ip;

	}

	public String CA() throws RemoteException {
		return CA;

	}

	public String US() throws RemoteException {
		return US;

	}

	public void updateUS(String ip) throws RemoteException {
		US = ip;

	}

	public String UK() throws RemoteException {
		return UK;

	}

	public void updateUK(String ip) throws RemoteException {
		UK = ip;

	}

}
package ser;

import java.rmi.Remote;

import java.rmi.RemoteException;

public interface addinterface extends Remote {
	
	int add(int a,int b) throws RemoteException;

}

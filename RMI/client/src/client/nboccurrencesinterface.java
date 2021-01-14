package client;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface nboccurrencesinterface extends Remote {
	public int nboccurences(String car, String chaine) throws RemoteException;
	
	
}

package ser;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface nboccurrencesinterface extends Remote {
	public int nboccurences(String c, String ch) throws RemoteException;
}

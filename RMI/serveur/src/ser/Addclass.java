package ser;
import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.server.*;
public class Addclass extends UnicastRemoteObject implements addinterface {
	public Addclass() throws RemoteException {
		super();
		}  
	public int add(int a,int b) throws RemoteException{
	    return a+b; 
	   }


}

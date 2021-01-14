package ser;
import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.server.*;
public class Nboccurencesclass extends UnicastRemoteObject implements nboccurrencesinterface {
	public Nboccurencesclass() throws RemoteException {
		super();
		}    
	public int nboccurences(String c,String ch) throws RemoteException{
		    if (ch == "")
		    	throw new RemoteException("chaine ne doit pas etre vide");
		    else if (c == "")
		    	throw new RemoteException("Saisir un caractere");
		    int longueur=ch.length();
		    int Nb=0;
		    for (int i=0; i<longueur; i++)
		    {
		    if ((ch.substring(i, i+1)).equals(c))
		   Nb++;
		    }
		    return Nb; 
		   }

}



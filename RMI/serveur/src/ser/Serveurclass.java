package ser;
import java.rmi.*;
import java.rmi.server.*;
public class Serveurclass {

	public static void main(String[] args) {
		try {
			 System.out.println("Serveur : Construction de l’implémentation");
			 Addclass add= new Addclass();
			 System.out.println("Objet Add lié dans RMIregistry");
			 Naming.rebind("rmi://clementine.cnam.fr:2001/Addition", add);
			 Nboccurencesclass nboccurences = new Nboccurencesclass();
			 System.out.println("Objet Nboccurences lié dans RMIregistry");
			 Naming.rebind("rmi://clementine.cnam.fr:2001/Chaine",nboccurences );
			 System.out.println("Attente des invocations des clients ");
			 }
			 catch (Exception e) {
			 System.out.println("Erreur de liaison de l'objet Objet Nboccurences ou Objet Add");
			 System.out.println(e.toString());
			 }
	}

}

package client;
import java.io.*;
import java.rmi.*;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) throws IOException {
		try{
			int nb=0;
			Scanner ch = new Scanner(System.in);
			System.out.println("Saisir une chaine ");
			String chaine = ch.nextLine();
			Scanner c = new Scanner(System.in);
		    System.out.println("Saisir un caractere ");
		    String car = c.nextLine();
			nboccurrencesinterface nboccu = (nboccurrencesinterface)Naming.lookup("rmi://clementine.cnam.fr:2001/Chaine");
			nb = nboccu.nboccurences(car, chaine);
			System.out.println(" Dans la phrase "+ch+", il y a"+nb+" occurrences de " + car);
			}
			catch (Exception e)
			{System.out.println ("Erreur d'accès à l'objet distant.");
			System.out.println (e.toString());
			}
	
	    try{
	    	Scanner sc1 = new Scanner(System.in);
	        System.out.println("Saisir une nombre ");
	        int a = sc1.nextInt();
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("Saisir un autre nombre ");
	        int b = sc2.nextInt();
	        int somme =0;
		     addinterface Add = (addinterface)Naming.lookup("rmi://clementine.cnam.fr:2001/Addition");
		     somme = Add.add(a,b);
		     System.out.println(" la somme de "+a+" + "+b+" = " + somme);
		     }
		     catch (Exception e)
		     {System.out.println ("Erreur d'accès à l'objet distant.");
		      System.out.println (e.toString());}
		    }	
	
}




/*
 * TP0 Exercice 1
 * BARBARIT TDA
 * Septembre 2023
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println("Bonjour");
    System.out.println("Bien ou bien ?");
    System.out.println("Au revoir");
    int i=20;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Bonjour, comment t'appelles-tu ?");
        String prenom = sc.nextLine();
    System.out.print("Bonjour "+prenom+", Enchante.");
    }
    
}

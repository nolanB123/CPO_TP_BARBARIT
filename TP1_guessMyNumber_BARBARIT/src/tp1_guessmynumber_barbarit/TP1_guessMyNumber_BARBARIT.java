/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_barbarit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_guessMyNumber_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nalea = generateurAleat.nextInt(100);
        System.out.println("Saisissez la diificulte que vous souhaitez :\n1) Facile\n2) Moyen\n3) Difficile\n4) Cauchemar");
        int diff = sc.nextInt();
        System.out.println("Devinez le nombre entre 0 et 100");
        int nuser = sc.nextInt();
        int i = 1;
        int nalea2;
        while (nalea != nuser) {
            if (i >= 8 && diff == 3) {
                break;
            }
            if (nalea > nuser) {
                if (nalea > nuser + 20 && diff == 1) {
                    System.out.println("Le nombre saisi est vraiment trop petit\nReessayez : ");
                }
                if (diff == 4) {
                    nalea2 = generateurAleat.nextInt(9);
                    if (nalea2 <= 2) {
                        System.out.print("Le nombre saisi est trop grand\nReessayez : ");
                    } else {
                        System.out.print("Le nombre saisi est trop petit\nReessayez : ");
                    }
                } else {
                    System.out.print("Le nombre saisi est trop petit\nReessayez : ");
                }
                nuser = sc.nextInt();
                i++;
            }
            if (nalea < nuser) {
                if (nalea < nuser - 20 && diff == 1) {
                    System.out.println("Le nombre saisi est vraiment trop grand\nReessayez : ");
                }
                if (diff == 4) {
                    nalea2 = generateurAleat.nextInt(9);
                    if (nalea2 <= 2) {
                        System.out.print("Le nombre saisi est trop petit\nReessayez : ");
                    }
                    else{
                        System.out.print("Le nombre saisi est trop grand\nReessayez : ");
                    }
                } 
                else {
                    System.out.print("Le nombre saisi est trop grand\nReessayez : ");
                }
                nuser = sc.nextInt();
                i++;
            }
        }
        if (nalea == nuser) {
            System.out.println("Gagne !\nVous avez pris " + i + " tentatives.");
        } else {
            System.out.println("Perdu vous n'avez pas trouvé au bout de 5 tentatives.\nLe nombre etait : " + nalea);
        }
    }

}

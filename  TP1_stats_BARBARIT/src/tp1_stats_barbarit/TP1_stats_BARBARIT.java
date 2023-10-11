/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_barbarit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_stats_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] tableau = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier m : ");
        int m = scanner.nextInt();
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            
            int nombreAleatoire = random.nextInt(6);

            tableau[nombreAleatoire]++;
        }

        System.out.println("Resultats sous forme de pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = ((double) tableau[i] / m) * 100;
            System.out.printf("Face %d : %.2f%%\n", i + 1, pourcentage);
        }
    }
    
}

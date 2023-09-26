/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_barbarit;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_manipNombresInt_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Saisissez le premier nombre :");
        int var1 = sc.nextInt();
         System.out.println("Vous avez saisi le nombre : "+var1+"\nSaisissez le deuxieme nombre :");
        int var2 = sc.nextInt();
        System.out.println("Vous avez saisi le nombre : "+var2);
        System.out.println(var1+" + "+var2+" = "+(var1+var2));
        System.out.println(var1+" - "+var2+" = "+(var1-var2));
        System.out.println(var1+" * "+var2+" = "+(var1*var2));
        System.out.println(var1+" / "+var2+" = "+(var1/var2));
        System.out.println(var1+" modulo "+var2+" = "+(var1%var2));
    }
    
}

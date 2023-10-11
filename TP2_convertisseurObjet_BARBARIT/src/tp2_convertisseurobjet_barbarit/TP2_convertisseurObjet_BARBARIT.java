/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_barbarit;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP2_convertisseurObjet_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur premierconvertisseur = new Convertisseur();
        System.out.println("Bonjour, saisissez une valeur :");
        double var = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :" + "\n1) CelciusVersKelvin" + "\n2) KelvinVersCelcius" + "\n3) FarenheitVersCelcius" + "\n4) CelciusVersFarenheit" + "\n5) KelvinVersFarenheit" + "\n6) FarenheitVersKelvin");
        double choix = sc.nextDouble();
        if (choix == 1) {
            System.out.println(var + " degre Celcius est egal a " + premierconvertisseur.CelciusVersKelvin(var) + " degres Kelvin");
        }
        if (choix == 2) {
            System.out.println(var + " degre Kelvin est egal a " + premierconvertisseur.KelvinVersCelcius(var) + " degres Celcius");
        }
        if (choix == 3) {
            System.out.println(var + " degre Farenheit est egal a " + premierconvertisseur.FarenheitVersCelcius(var) + " degres Celcius");
        }
        if (choix == 4) {
            System.out.println(var + " degre Celcius est egal a " + premierconvertisseur.CelciusVersFarenheit(var) + " degres Farenheit");
        }
        if (choix == 5) {
            System.out.println(var + " degre Kelvin est egal a " + premierconvertisseur.KelvinVersFarenheit(var) + " degres Farenheit");
        }
        if (choix == 6) {
            System.out.println(var + " degre Farenheit est egal a " + premierconvertisseur.FarenheitVersKelvin(var) + " degres Kelvin");
        }

    }
}

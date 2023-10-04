/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_barbarit;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_convertisseur_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Bonjour, saisissez une valeur :");
        double var = sc.nextDouble();
         System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n1) CelciusVersKelvin"+"\n2) KelvinVersCelcius"+"\n3) FarenheitVersCelcius"+"\n4) CelciusVersFarenheit"+"\n5) KelvinVersFarenheit"+"\n6) FarenheitVersKelvin");
        double choix = sc.nextDouble();
         if(choix==1){
             System.out.println( var+" degre Celcius est egal a "+ CelciusVersKelvin(var) +" degres Kelvin");
         }
         if(choix==2){
             System.out.println( var+" degre Kelvin est egal a "+ KelvinVersCelcius(var) +" degres Celcius");
        }
        if(choix==3){
             System.out.println( var+" degre Farenheit est egal a "+ FarenheitVersCelcius(var) +" degres Celcius");
        }
        if(choix==4){
             System.out.println( var+" degre Celcius est egal a "+ CelciusVersFarenheit(var) +" degres Farenheit");
        }
        if(choix==5){
             System.out.println( var+" degre Kelvin est egal a "+ KelvinVersFarenheit(var) +" degres Farenheit");
        }
        if(choix==6){
             System.out.println( var+" degre Farenheit est egal a "+  FarenheitVersKelvin(var) +" degres Kelvin");
        }
    }     
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius+273.15;
        return tKelvin;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius = tKelvin+273.15;
        return tCelcius;    
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius = ((tFarenheit - 32) / 1.8);
        return tCelcius;    
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit = ((tCelcius*1.8)+32);
        return tFarenheit;    
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        double tFarenheit= CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        return tFarenheit;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        double tKelvin = CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return tKelvin;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Utilisateur
 */

public abstract class Arme {
    String nom;
    int niveau_attaque;
        
    public Arme (String nom_arme,int niv_attaque){
        nom = nom_arme;
        niveau_attaque=niv_attaque;
        if (niveau_attaque>100){
            niveau_attaque=100;
        }
    }    
    
     @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Nom de l'arme : "+nom + "\nNiveau d'attaque : "+niveau_attaque;
        return chaine_a_retourner;
    }
}

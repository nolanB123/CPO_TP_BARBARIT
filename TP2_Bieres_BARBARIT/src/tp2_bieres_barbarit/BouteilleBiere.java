/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_barbarit;

/**
 *
 * @author Utilisateur
 */
public class BouteilleBiere {

    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
    }

    public boolean Decapsuler() {
        if (ouverte == true) {
            System.out.println(" erreur : biere déjà ouverte");
        } else {
            ouverte = true;
        }
        return ouverte;
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
    if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}

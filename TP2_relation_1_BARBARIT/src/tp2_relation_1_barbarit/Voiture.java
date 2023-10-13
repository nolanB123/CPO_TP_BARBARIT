/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_barbarit;

/**
 *
 * @author Utilisateur
 */
public class Voiture {
    private String marque;
    private String modèle;
    private int année;
    private Personne proprietaire;

    public Voiture(String marque, String modèle, int année) {
        this.marque = marque;
        this.modèle = modèle;
        this.année = année;
        this.proprietaire = null; 
    }

    public String getMarque() {
        return marque;
    }

    public String getModèle() {
        return modèle;
    }

    public int getAnnée() {
        return année;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Voiture [marque=" + marque + ", modèle=" + modèle + ", année=" + année + "]";
    }

    void setProprietaire(Personne aThis) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_barbarit;

/**
 *
 * @author Utilisateur
 */
public class Personne {

    private String nom;
    private String prénom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3];
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        if (voiture_a_ajouter.getProprietaire() != null) {
            return false;
        }

        if (nbVoitures >= 3) {
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        voiture_a_ajouter.setProprietaire(this);
        nbVoitures++;

        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prénom=" + prénom + "]";
    }

}

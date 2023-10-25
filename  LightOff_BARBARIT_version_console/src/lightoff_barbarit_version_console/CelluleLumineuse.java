/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_barbarit_version_console;

/**
 *
 * @author Utilisateur
 */
public class CelluleLumineuse {

    private boolean etat = false;

    /**
     * permet d'obtenir l'�tat courant de la cellule
     * @return etat : boolean
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Permet d'initialiser la variable etat sur false
     *
     * @param etat_lumiere
     */
    public void setEtat() {

        etat = false;

    }

    /**
     * Permet � l'utilisateur de changer l'�tat de la lumi�re comme en appuyant
     * sur un interrupteur
     */
    public void activerCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = true;
        }
    }

    /**
     *Permet d'�teindre la cellule peut importe son �tat
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
    }
    
    /**
     * permet de d�terminer l'�tat
       actuel de la cellule sans n�cessairement consulter la variable etat directement
     * @return
     */
    public boolean estEteint(){
        if (etat==true){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Permet d'appeler le setteur d�s la cr�ation d'un nouvel objet
     */
    public CelluleLumineuse() {
        setEtat();
    }

    /**
     * Affiche l'�tat de la lumi�re � l'utilisateur
     *
     * @return chaine_a_retourner : Chaine de caract�res sur l'�tat de la
     * lumi�re
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "";
        if (etat == true) {
            chaine_a_retourner += "X";
        } else {
            chaine_a_retourner += "O";
        }
        return chaine_a_retourner;
    }
}

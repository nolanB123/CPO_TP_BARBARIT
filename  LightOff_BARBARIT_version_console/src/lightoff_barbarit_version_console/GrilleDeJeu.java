/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_barbarit_version_console;

import java.util.ArrayList;
import lightoff_barbarit_version_console.CelluleLumineuse;
import java.util.Random;

/**
 *
 * @author Utilisateur
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    static Random generateur_aleat = new Random();

    /**
     *Permet de représente une grille de cellules lumineuses
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     *permet d'éteindre toutes les cellules de la grille, en passant chaque cellule en état "éteint".

     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     *Active de manière aléatoire soit une ligne, soit une colonne, soit une diagonale de cellules dans la grille
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix_ligne_colonee_diago = generateur_aleat.nextInt(3);

        if (choix_ligne_colonee_diago == 0) {
            int colonne_alea = generateur_aleat.nextInt(nbColonnes - 1);
            for (int i = 0; i < nbLignes; i++) {

                matriceCellules[i][colonne_alea].activerCellule();

            }
        }

        if (choix_ligne_colonee_diago == 1) {
            int ligne_alea = generateur_aleat.nextInt(nbLignes - 1);
            for (int i = 0; i < nbColonnes; i++) {
                matriceCellules[ligne_alea][i].activerCellule();
            }
        } else {
            int diago = generateur_aleat.nextInt(2);
            if (diago == 0) {
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][i].activerCellule();
                }

            } else {
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][nbLignes - i-1].activerCellule();
                }
            }
        }
    }

    /**
     *permet de mélanger la grille Aléatoirement un certain nombre de tours
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     *Active toutes les cellules d'une ligne spécifique de la grille, dont le numéro est passé en paramètre
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[idLigne][i].activerCellule();
        }
    }

    /**
     *Active toutes les cellules d'une colonne spécifique de la grille, dont le numéro est passé en paramètre
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     *Active toutes les cellules de la diagonale descendante
     */
    public void activerDiagonaleDescendante(){
        for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][i].activerCellule();
                }
    }

    /**
     *Active toutes les cellules de la diagonale montante
     */
    public void activerDiagonaleMontante(){
        for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][nbLignes - i].activerCellule();
                }
    }
    
    /**
     * Verifie si toutes les cellules de la grille entiere sont eteintes
     * @return
     */
    public boolean cellulesToutesEteintes(){
        int nb_cellules_allumes=0;
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()==false){
                    nb_cellules_allumes++;
                }
            }
        }
        if (nb_cellules_allumes==0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *Permet d'afficher la grille avec les cellules
     * @return
     */
    @Override
    public String toString() {
        String chaine_a_retourner="   |";
        
        for (int i=0;i<nbColonnes;i++){
            chaine_a_retourner+=" "+i+" |";
        }
        chaine_a_retourner+="\n----";
        for (int j=0;j<nbColonnes;j++){
            chaine_a_retourner+="----";
        }
        
        for(int k=0;k<nbLignes;k++){
            chaine_a_retourner+="\n "+k+" |";
            for (int l=0;l<nbColonnes;l++){
                chaine_a_retourner+=" "+matriceCellules[k][l].toString()+" |";
            }
            chaine_a_retourner+="\n";
            for(int m=0;m<nbColonnes+1;m++){
            chaine_a_retourner+="----";
                    }
        }
        
        return chaine_a_retourner;
    }
    
    
    
}

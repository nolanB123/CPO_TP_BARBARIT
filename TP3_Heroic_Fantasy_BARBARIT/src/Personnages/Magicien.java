package Personnages;

import Personnages.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Utilisateur
 */
public class Magicien extends Personnage {

    boolean confirme;
    static int nb_magiciens=0;

    public void setConfirme(String confirme_non) {
        if (confirme_non == "confirmé") {
            confirme = true;
        } else {
            confirme = false;
        }
    }
    
    public int compter_magicien(){
        System.out.println("Le nombre de magiciens : "+nb_magiciens);
        return nb_magiciens;
    }

    public Magicien(String nom_perso, int niv_vie, String confirme_non) {
        super(nom_perso, niv_vie);
        setConfirme(confirme_non);
        nb_magiciens++;
    }

}

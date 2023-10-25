/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public abstract class Personnage {
    
    String nom;
    int niveau_vie;
    ArrayList<Arme> ArmesPerso = new ArrayList<>();    
    Arme Arme_en_Main = null;
    static int nb_persos=0;

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    public Personnage (String nom_perso,int niv_vie){
        nom = nom_perso;
        niveau_vie=niv_vie;
        nb_persos++;
    }    
    
    public int compter_personnages(){
        System.out.println("Le nombre de perssonages : "+nb_persos);
        return nb_persos;
    }
    
    public void ajouter(Arme Arme_ajoutee) {
            if (ArmesPerso.size()<5){
                ArmesPerso.add(Arme_ajoutee);
            }
    }
    
    public void Nouvelle_Arme_en_Main(Arme Nouvelle_Arme){
        for (int i =0;i<ArmesPerso.size();i++){
            if (ArmesPerso.get(i).equals(Nouvelle_Arme)){
                Arme_en_Main = Nouvelle_Arme;
            }
        }
    }
    
    
     @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Nom du personnage : "+nom + "\nNiveau de vie : "+niveau_vie;
        if (Arme_en_Main ==null){
            chaine_a_retourner+="\nArme en Main : Aucune";
        }
        else{
            chaine_a_retourner+="\nArme en Main : "+Arme_en_Main.toString();
        }
        return chaine_a_retourner;
    }
}

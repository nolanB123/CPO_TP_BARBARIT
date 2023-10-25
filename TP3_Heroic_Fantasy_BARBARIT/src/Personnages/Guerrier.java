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
public class Guerrier extends Personnage {

    boolean a_cheval;
    static int nb_guerriers=0;
    
    public void setA_cheval(String cheval) {
       if(cheval=="à cheval"){
           a_cheval = true;
       }
       else{
           a_cheval = false;
       }
    }
    
    public int compter_guerrier(){
        System.out.println("Le nombre de guerriers : "+nb_guerriers);
        return nb_guerriers;
    }

    public Guerrier(String nom_perso, int niv_vie,String cheval) {
        super(nom_perso, niv_vie);
        setA_cheval(cheval);
        nb_guerriers++;
        
        
    }


}

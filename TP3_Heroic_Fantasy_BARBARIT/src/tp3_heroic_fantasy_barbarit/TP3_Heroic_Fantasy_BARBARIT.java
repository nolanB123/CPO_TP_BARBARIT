/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_barbarit;

import Personnages.*;
import Armes.*;

import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class TP3_Heroic_Fantasy_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arme Epee1 = new Epee("Excalibur", 7, 5);
        Arme Epee2 = new Epee("Durandal", 4, 7);
        Arme Epee3 = new Epee("Curtana", 8, 3);
        Arme Baton1 = new Baton("Chene", 4, 5);
        Arme Baton2 = new Baton("Charme", 5, 6);
        Arme Baton3 = new Baton("Sureau", 9, 11);

        ArrayList<Arme> TableauArmes = new ArrayList<>();
        TableauArmes.add(Epee1);
        TableauArmes.add(Epee2);
        TableauArmes.add(Epee3);
        TableauArmes.add(Baton1);
        TableauArmes.add(Baton2);
        TableauArmes.add(Baton3);

        Personnage Magicien1 = new Magicien("Gandalf", 65, "confirmé");
        Personnage Guerrier1 = new Guerrier("Conan", 78, "à pied");

        ArrayList<Personnage> TableauPersos = new ArrayList<>();
        TableauPersos.add(Magicien1);
        TableauPersos.add(Guerrier1);

        Magicien1.ajouter(Baton1);
        Magicien1.ajouter(Epee1);
        Magicien1.ajouter(Epee2);
        Guerrier1.ajouter(Baton2);
        Guerrier1.ajouter(Baton3);
        Guerrier1.ajouter(Epee3);
        
        Magicien1.Nouvelle_Arme_en_Main(Baton1);
        Guerrier1.Nouvelle_Arme_en_Main(Epee3);
        
        System.out.println(Magicien1);
        System.out.println(Guerrier1);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_barbarit_version_console;
import lightoff_barbarit_version_console.*;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Partie {
    
    GrilleDeJeu grille;
    int nbCoups;
    
    /**
     *Crée la partie
     * @param grille_a_jouer
     */
    public Partie(GrilleDeJeu grille_a_jouer){
        grille= grille_a_jouer;
        nbCoups=0;
    }
    
    Scanner sc = new Scanner(System.in);
    
    /**
     *Melange la grille avant de lancer la partie
     */
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(20);
    }
    
    /**
     *Permet de jouer et lancer la partie
     */
    public void lancerPartie(){
        System.out.println(grille.toString());
        
        while (!grille.cellulesToutesEteintes()){
            
            System.out.println("Saisissez le  numéro de votre choix : \n1.ligne\n2.colonne\n3.diagonale montante\n4.diagonale descendante");
            int nbsaisi=sc.nextInt();
            
            if(nbsaisi==1){
                System.out.println("Saisissez le numéro de la ligne correspondante");
                int lignesaisi=sc.nextInt();
                
                /*if (lignesaisi>nbLignes){
                    
                }
                */
                
                grille.activerLigneDeCellules(lignesaisi);
                nbCoups++;
                System.out.println(grille.toString());
                
                
            }
            
            if(nbsaisi==2){
                System.out.println("Saisissez le numéro de la colonne correspondante");
                int colonnesaisi=sc.nextInt();
                grille.activerColonneDeCellules(colonnesaisi);
                nbCoups++;
                System.out.println(grille.toString());
                
                
            }
            
            if(nbsaisi==3){
                grille.activerDiagonaleMontante();
                nbCoups++;
                System.out.println(grille.toString());
                
            }
            
            if(nbsaisi==4){
                grille.activerDiagonaleDescendante();
                nbCoups++;
                System.out.println(grille.toString());
                
            }
            
            if(nbsaisi!=1&&nbsaisi!=2&&nbsaisi!=3&&nbsaisi!=4){
                System.out.println(grille.toString());
                System.out.println("Vous n'avez pas saisi un des numéros présentés\nVeuillez réessayer");
            }
        }
        
        System.out.println("Bravo, vous avez gagné en "+nbCoups+" coups !!!!");
    }
    
    
    
    
    
}

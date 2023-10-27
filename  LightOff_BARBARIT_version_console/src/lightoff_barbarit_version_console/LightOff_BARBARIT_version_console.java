/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_barbarit_version_console;
import lightoff_barbarit_version_console.*;
/**
 *
 * @author Utilisateur
 */
public class LightOff_BARBARIT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        GrilleDeJeu nouvelle_grille = new GrilleDeJeu(6,6);
        nouvelle_grille.melangerMatriceAleatoirement(8);
        System.out.println(nouvelle_grille);
    }
    
}

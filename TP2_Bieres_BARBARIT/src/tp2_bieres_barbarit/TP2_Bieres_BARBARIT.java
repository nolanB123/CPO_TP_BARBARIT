/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_barbarit;

/**
 *
 * @author Utilisateur
 */
public class TP2_Bieres_BARBARIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", (float) 7.0,"Dubuisson") ;
        uneBiere.ouverte=false;
        uneBiere.Decapsuler();
        System.out.println(uneBiere) ;
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        autreBiere.Decapsuler();
        System.out.println(autreBiere) ;
        BouteilleBiere Bierepoubelle = new BouteilleBiere("86", (float) 8.6,"New Orleans") ;
        Bierepoubelle.ouverte=false;
        System.out.println(Bierepoubelle) ;
        BouteilleBiere BiereRuby = new BouteilleBiere("Leffe", (float) 3.4,"Brasserie des pirates") ;
        BiereRuby.ouverte=false;
        BiereRuby.lireEtiquette();
        BouteilleBiere Biereireland = new BouteilleBiere("Guiness", (float) 6.3,"Dupont") ;
        Biereireland.ouverte=false;
        Biereireland.lireEtiquette();
        


    }
    
}

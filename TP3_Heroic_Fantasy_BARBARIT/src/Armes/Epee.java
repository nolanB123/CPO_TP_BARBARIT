/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Utilisateur
 */
public class Epee extends Arme{
    int indice_finesse;

    public Epee(String nom_arme, int niv_attaque,int finesse) {
        super(nom_arme, niv_attaque);
        indice_finesse=finesse;
    }
    
    
}

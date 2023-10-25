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
public class Baton extends Arme {

    int age;

    public Baton(String nom_arme, int niv_attaque,int age_bat) {
        super(nom_arme, niv_attaque);
        age=age_bat;
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:" + "\n1) add" + "\n2) substract" + "\n3) multiply" + "\n4) divide" + "\n5) modulo");
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        if (operateur<1 || operateur>5){
            System.out.println("Impossible. L'opérateur doit être compris entre 1 et 5.Veuillez relancer le programme.");
            System.exit(0);
        }
        System.out.println("Please enter the first number :");
        int operande1 = sc.nextInt();
        System.out.println("Please enter the second number :");
        int operande2 = sc.nextInt();
        int result=0;
        if (operateur==1){
            result=operande1+operande2;
        }
        if(operateur==2){
            result=operande1-operande2;
        }
        if(operateur==3){
            result=operande1*operande2;
        }
        if(operateur==4){
            result=operande1/operande2;
        }
        if(operateur==5){
            result=operande1%operande2;
        }
        System.out.println("The result is : "+result);
    }
}

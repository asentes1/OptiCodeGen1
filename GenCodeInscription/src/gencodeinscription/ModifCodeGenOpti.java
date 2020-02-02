/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencodeinscription;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Alex
 */
public class ModifCodeGenOpti {
    
    public static void main(String[] args) {
       
        //Variables pour majuscules et chiffres pour le code
        String majus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        //chaine de caractères remplis aléatoirement
        String pwd = "";
        //instanciation de l'objet random comme nom rand
        Random rand = new Random();
        //initialisation de la longueur du code
        int longueur = 10;
        //boucle tant que la longueur du code est plus petite que la variable pwd
        while (pwd.length() < longueur) {
            //rPick est initialisé avec comme valeur 0 et 1
            int rPick = rand.nextInt(2);
            //suivant rPick 
            switch (rPick) {
                case 0 :
                    //si rPick vaut 0,on ajoute une lettre de la variable majus aléatoirement
                    pwd+=majus.charAt(rand.nextInt(25));
                    break;
                case 1 :
                    //si rPick vaut 1,on ajoute une lettre de la variable numbers aléatoirement
                    pwd+=numbers.charAt(rand.nextInt(9));
                    break;
            }
        }
        System.out.println(pwd);
        
    }
        
}


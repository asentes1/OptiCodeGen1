/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencodeinscription;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GenCodeInscription {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tableau lettres de l'alphabet
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println("La longueur du tableau est : " +alphabet.length);
        
        
        //Affichage de la taille du tableau alphabet
        //System.out.println("La longueur du tableau est : " +alphabet.length);
        //Créer une collection codeGen
        ArrayList codeGen = new ArrayList();
        //boucle de 5 donc 10 caractères a la fin dans le tableau
        for(int i=0;i<5;i++){
            
            //Génére un nombre entre 0 et 25
            int nombre_random_lettre = (int)(Math.random() * (25+1-0)) + 0;
            //Ajoute le contenu de la case alphabet[nombre_random] a la collection codeGen
            codeGen.add(alphabet[nombre_random_lettre]);
            
            //Génére un nombre en 0 et 9
            int nombre_random_nombre = (int)(Math.random() * (9+1-0)) + 0;
            //Ajoute le nombre random généré dans la collection codeGen
            codeGen.add(nombre_random_nombre);  
            
        }
        //Il faut ensuite convertir cette collection codeGen en string
        //pour que ce code soit de la forme toto123 sans virgule
        //je n'y arrive pas
        System.out.println(codeGen);
        
    }
 
    
    
    
        
        

}

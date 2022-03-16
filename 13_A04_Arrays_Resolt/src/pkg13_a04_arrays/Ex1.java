/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._a04_arrays;

import java.util.Scanner;

/**
 *
 * @author esther
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        char[] caracters;
        String text;
        int compt = 0;
        int pos = 0;

        //Llegir la línia de text
        System.out.println("Introduir una línia de text:");
        text = lector.nextLine();

        caracters = text.toCharArray();//torna un array de tipus char amb tots els caràcters de la cadena

        //saltem els possibles espais en blanc inicials:
        while (caracters[pos] == ' ' && pos < caracters.length) {
            pos++;
        }

        //Comptem paraules
        for (int i = pos; i < caracters.length - 1; i++) {
            if (caracters[i] == ' ' && caracters[i + 1] != ' ') {
                compt++;
            }
        }
        
        System.out.println("Comptador paraules: "+ (compt+1));
    }
    
}

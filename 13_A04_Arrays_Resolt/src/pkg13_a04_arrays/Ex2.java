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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        char[] caracters;
        String text;
        int compt = 0;

        //Llegir la línia de text
        System.out.println("Introduir una línia de text:");
        text = lector.nextLine();

        //inicialitzem l'array de caràcters
        caracters = new char[text.length()];

        //omplir l'array amb els caràcters de la cadena de text
        for (int i = 0; i < caracters.length; i++) {
            caracters[i] = text.charAt(i);
        }

        //substituir a l'array 't' per 'd 
        for (int i = 0; i < caracters.length; i++) {
            if (caracters[i] == 't') {
                caracters[i] = 'd';
                compt++;
            }
        }

        //imprimir línia de text modificada i canvis
        System.out.println("\nLínia modificada:");
        for (int i = 0; i < caracters.length; i++) {
            System.out.print(caracters[i]);
        }
        System.out.println("\n\nQuantitat de canvis: " + compt);
    }
    
}

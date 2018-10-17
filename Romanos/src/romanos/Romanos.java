/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

import java.util.Scanner;

/**
 *
 * @author moral
 */
public class Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num; 
        int n, numero;
        do {
            System.out.println("Introduce un número entre 1 y 1000: ");
            Scanner entrada = new Scanner (System.in);
            num = entrada.nextLine();
            n = Integer.parseInt(num);
        } while (n < 1 || n > 1000);
        
        int i, mil, centenas, decenas, unidades;
        String romano = "";
        numero = n;
        
        //obtener las cifras del número
        mil = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        //miles
        for (i = 1; i <= mil; i++) {
            romano = romano + "M";
        }

        //centenas
        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
            romano = romano + "D";
                for (i = 6; i <= centenas; i++) {
                    romano = romano + "C";
                }
        } else if (centenas == 4) {
            romano = romano + "CD";
        } else {
                for (i = 1; i <= centenas; i++) {
                    romano = romano + "C";
                }
        }

        //decenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
                for (i = 6; i <= decenas; i++) {
                    romano = romano + "X";
                }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
                for (i = 1; i <= decenas; i++) {
                           romano = romano + "X";
                }
        }

        //unidades
        if (unidades == 9) {
           romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
                for (i = 6; i <= unidades; i++) {
                    romano = romano + "I";
                }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }
      
        System.out.println(num + " en numeros romanos: " + romano);
        
        
    }
    
}

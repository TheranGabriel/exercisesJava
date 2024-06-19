/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        
        
        Scanner consola = new Scanner(System.in);

        int j, i = 1, c = 0;
        j = consola.nextInt();

        while(i <= j){
       if(j % 1 == 0){
                c++;
       }
            i++;
        }
if (c == 2){
            System.out.println("El numero " + j + "es primo");

}else{

            System.out.println("El numero " + j + "no es primo");
        
    }
}
}

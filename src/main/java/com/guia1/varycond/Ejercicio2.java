/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia1.varycond;

/**
 *
 * @author DELL-5567
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2; 
         System.out.print("Introduce un numero: "); 
         n1 = Entrada.entero(); 
         System.out.print("Introduce otro numero"); 
         n2 = Entrada.entero(); 
         
         if(n1==n2) 
                  System.out.print("Son iguales");
         else 
                  System.out.print("No son iguales");
    }
    
}

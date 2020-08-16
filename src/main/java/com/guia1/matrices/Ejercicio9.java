/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guia1.matrices;

import com.guia1.varycond.Entrada;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio9 {
    
      /**
     *
     * @param args
     */
    public static void main(String[] args) {
         int t[];
        t = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Intoduzca un numero: ");
            t[i]=Entrada.entero();
        }
        System.out.println("Los numeros son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(t[i]);
        }
    }
    

}

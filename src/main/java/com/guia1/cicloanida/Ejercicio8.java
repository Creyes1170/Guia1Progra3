/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guia1.cicloanida;

import com.guia1.varycond.Entrada;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio8 {
             /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j, num, cont_pri;
        boolean primo;
        cont_pri=0;
        
        System.out.println("Indroduce numero: ");
        num = Entrada.entero();
        
        for (int i = 0; i <= num; i++) {
            
            primo=true;
            j=2;
            
            while(j<=i-1 && primo==true)
            {
                if (i%j==0) {
                    primo=false;
                }
                j++;
            }
            
            if (primo==true) {
                cont_pri++;
                System.out.println(i+(" es primo"));
            }
        }
        System.out.println("En el rango 1.."+ num + ", hay "+ cont_pri + " numeros primos");
    }
}

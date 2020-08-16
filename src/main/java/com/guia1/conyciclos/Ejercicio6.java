/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guia1.conyciclos;

import com.guia1.varycond.Entrada;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio6 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
    {
        int sueldo,suma,mayor_1000;
        suma=0;
        mayor_1000=0;
        for (int i=1;i<10;i++)
        {
            System.out.print("Escribe el sueldo: ");
            sueldo=Entrada.entero();
            if (sueldo>1000)
                mayor_1000++;
                suma = suma +sueldo;   
        }
        System.out.print("Mayores de 1000 hay: "+ mayor_1000);
        System.out.print("La suma es de: "+ suma);
        
    }
    
    }
}

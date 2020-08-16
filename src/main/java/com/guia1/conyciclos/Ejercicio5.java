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
public class Ejercicio5 {
     public static void main(String[] args)
    {
        int num;
        System.out.print("Introduzca el numero: ");
        num = Entrada.entero();
    
        while(num!=0)
        {
            if (num>0)
            
                System.out.print("Es positivo\n ");
            else
            
                System.out.print("Es negativo\n ");
                
                
            System.out.print("Introduzca otro numero: ");
            num=Entrada.entero();
             
             
        }
    
    }

}

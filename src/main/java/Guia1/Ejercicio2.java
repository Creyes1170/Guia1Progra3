/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import com.guia1.varycond.Entrada;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a;
       System.out.print("Introduzca su numero por favor: ");
       a=Entrada.entero();
       
       while (a!=0) {
           if (a==10)
               System.out.print("El numero es igual a 10\n");
           else
           if (a>10)
               System.out.print("El numero es mayor a 10 \n ");
                else 
                   if (a<10)
                        System.out.print("El numero es menor a 10\n ");
                        else  
                        System.out.print("Introduzca otro numero por favor: ");
                        a = Entrada.entero();
           
        }
    }
}

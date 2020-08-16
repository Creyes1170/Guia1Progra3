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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int resultado = 12;
        System.out.print("Introduzca su numero: ");
        a=Entrada.entero();
        
        if (a == resultado)
            System.out.print("Su numero es el 12");
        else 
            System.out.print("Su numero es diferente al 12");      
    }
    
}

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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        double a,b,c ;  
        double x1,x2,d ; 
        
        
        System.out.print("Introduzca el primer coeficiente (a): ") ; 
        a=Entrada.entero(); 
          System.out.print("Introduzca el primer coeficiente (b): ") ; 
        b=Entrada.entero(); 
         System.out.print("Introduzca el primer coeficiente (c): ") ; 
        c=Entrada.entero(); 
        //calculamos el determinante
        d = ((b* b ) - 4*a*c) ;
        
       
        if (d<0)
            System.out.print("No existen soluciones reales");
        else{// si a=0 nos encontramos una divison por cero 
            
            x1= (-b + Math.sqrt(d)) / (2*a) ;
            x2= (-b + Math.sqrt(d)) / (2*a) ;
            
            System.out.print("Solucion: " + x1);
            System.out.print("Solucion: " + x2);
        }
 
        
        
    }
    
}

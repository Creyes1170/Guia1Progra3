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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c; 
        System.out.print("Introduzca el primer numero: ");
        a=Entrada.entero();
         System.out.print("Introduzca el segundo numero: ");
        b=Entrada.entero();
         System.out.print("Introduzca el tercer numero: ");
        c=Entrada.entero();
        if(a>b && b>c)
             System.out.print(a+",   "+b+",   "+c);
        else{
             if(a>c && c>b)
                     System.out.print(a+",   "+c+",   "+b);
             else{
                 if(b>a && a>c)
                     System.out.print(b+",   "+a+",   "+c);
                  else{
                       if(b>c && c>a)
                            System.out.print(b+",   "+c+",   "+a);
                       else{
                            if(c>a && a>b)
                                System.out.print(c+",   "+a+",   "+b); 
                            else {
                                  if(c>b && b>a)
                                     System.out.print(c+",   "+b+",   "+a);
                            }
                       }
                    }          
                }   
             }   
        }
}

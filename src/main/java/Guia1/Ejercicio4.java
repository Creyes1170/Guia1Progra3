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
public class Ejercicio4 {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          char t[] = new char [6];
        
        for (int i = t.length- 1; i >= 0; i--){
            System.out.println("\nIntoduzca una letra: ");
           
            t[i]= Entrada.caracter();
        }
        System.out.println("\nLas letras invertidas son: ");
        
        for (char i = 0; i < 6; i++) {
            
            System.out.println(t[i]);
        }
    }
}

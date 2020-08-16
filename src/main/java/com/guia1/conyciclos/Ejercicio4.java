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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, cuadrado;
        System.out.print("Introduzca numero: ");
        num = Entrada.entero();

        while(num >=0) {
            cuadrado=num*num;
            System.out.println(num+ " es igual a " + cuadrado);
            System.out.print("Introduzca otro numero: ");
            num=Entrada.entero();
        }

    }
}   


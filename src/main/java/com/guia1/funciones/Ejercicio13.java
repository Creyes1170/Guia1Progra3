/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guia1.funciones;

import com.guia1.varycond.Entrada;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio13 {
    static int maximo(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.print("Introduce un numero: ");
        a = Entrada.entero();
        System.out.print("Introduzca otro numero: ");
        b = Entrada.entero();
        max = maximo(a, b);
        System.out.println("El número mayor es: " + max);
    }


}

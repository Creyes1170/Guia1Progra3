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
public class Ejercicio14 {

    static boolean es_primo(int num) {
        boolean primo;
        int i;
        primo = true;
        i = 2;
        while (i < num && primo == true) 
        {
            if (num % i == 0) 
                primo = false; 
            i++;
        }
        return (primo);
    }
    static int num_divisores(int num) {
        int cont;
        cont = 1; 
        for (int i = 2; i <= num; i++)
            if (es_primo(i) && num % i == 0)
                cont++; 
        return (cont);
    }

    public static void main(String[] args) {
        int num, div;
        System.out.print("Introduce numero: ");
        num = Entrada.entero();
        div = num_divisores(num);
        System.out.println("Tiene " + div + " divisores");
    }
}

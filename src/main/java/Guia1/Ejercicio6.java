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
public class Ejercicio6 {
    public static void main(String[] args)
    {
    
    int num1, num2, resultado;
        
        System.out.print("Introduzca el primer número: ");
        num1 = Entrada.entero();

        System.out.print("Introduzca el segundo número: ");
        num2 = Entrada.entero();

        resultado = Operacion(num1, num2);

        System.out.println("La resta es: " + resultado);
    }

    private static int Operacion(int i, int j)
    {
        return i - j;
    }
}
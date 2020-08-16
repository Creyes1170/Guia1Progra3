/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia1.matrices;

import com.guia1.varycond.Entrada;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[];
		int i;
		boolean creciente, decreciente;
		numeros = new int [10];
		creciente = false;
		decreciente = false;
		System.out.println("Leyendo numeros:");
		for (i=0; i<10; i++)
		{
			System.out.print("numero: ");
			numeros[i]=Entrada.entero();
		}
		
		for (i=0; i<9; i++)		
		{
			if (numeros[i]>numeros[i+1])	
				decreciente=true;
			if (numeros[i]<numeros[i+1])	
				creciente=true;								
		}
		
		if (creciente == true && decreciente == false)		
			System.out.println("Serie creciente.");
		if (creciente == false && decreciente == true)		
			System.out.println("Serie decreciente.");
		if (creciente == true && decreciente == true)		
			System.out.println("Serie desordenada.");
		if (creciente == false && decreciente == false)				
			System.out.println("Todos los numeros son iguales.");	
	}	

    }    

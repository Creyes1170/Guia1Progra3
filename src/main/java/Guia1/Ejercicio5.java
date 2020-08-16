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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Fi1,Co1,Fi2,Co2,matriz1[][],matriz2[][], MR[][];
        
        
        System.out.println("Ponga la cantidad de filas de la primer matriz: ");
        Fi1 = Entrada.entero();
        System.out.println("ponga la cantidad de columnas de la primer matriz: ");
        Co1 = Entrada.entero();
        System.out.println("ponga la cantidad de filas de la segunda matriz: ");
        Fi2 = Entrada.entero();
        System.out.println("ponga la cantidad de columnas de la segunda matriz: ");
        Co2 = Entrada.entero();
        System.out.println("Datos ingresados");
        System.out.println(" Matriz 1 de: " + Fi1 + "*" + Co1 + " ");
        System.out.println(" Matriz 2 de: " + Co2 + "*" + Co2 + " ");
        System.out.println("*************");
        if (Co1 == Fi2) {
            matriz1 = new int[Fi1][Co1];
            matriz2 = new int[Fi2][Co2];
            MR = new int[Fi1][Co2];
            System.out.println("matriz 1: ");
            for (int i = 0; i < Fi1; i++) {
                for (int j = 0; j < Co1; j++) {
                    System.out.println("ponga el valor del elemento " + i + "," + j + ": ");
                    matriz1[i][j] = Entrada.entero();
                }
            }
            //Matriz 1
            System.out.println("Matriz 1");
            for (int i = 0; i < Fi1; i++) {
                for (int j = 0; j < Co1; j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");
            }
            //Matriz 2
            System.out.println("->matriz 2");
            for (int i = 0; i < Fi2; i++) {
                for (int j = 0; j < Co2; j++) {
                    System.out.println("ponga el valor del elemento " + i + "," + j + ": ");
                    matriz2[i][j] = Entrada.entero();
                }
            }
            System.out.println("Matriz 2");
            for (int i = 0; i < Fi2; i++) {
                for (int j = 0; j < Co2; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println("");
            }
            //Matriz Resultante
            System.out.println("matriz Resultante");
            for (int i = 0; i < Fi1; i++) {
                for (int j = 0; j < Co2; j++) {
                    for (int h = 0; h < Co1; h++) {
                        MR[i][j] += matriz1[i][h] * matriz2[h][j];
                    }
                    System.out.print(MR[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Tienen que ser iguales");
        }

    }

}
    


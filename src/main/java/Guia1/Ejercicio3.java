/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int suma, i;

        for (suma = 1; suma <= 10; suma++) {
            System.out.println("\n\nTabla de sumas " + suma);
            System.out.println("***");
            for (i = 1; i <= 10; i++) {
                System.out.println(suma + " + " + i + " = " + (suma + i));
            }
        }
    }
}
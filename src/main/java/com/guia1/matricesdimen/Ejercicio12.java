/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia1.matricesdimen;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        int t[][];

        t = new int[8][6]; 
       
        for (i=0;i<8;i++)
            for (j=0;j<6;j++) {
                if(i==0 || i==7) 
                    t[i][j]=1;
                        if(j==0 || j==5)
                            t[i][j]=1;
                                }
                                    System.out.print("Matriz marco: ");
                                        for (i=0;i<8;i++){
                                            System.out.println();
                                                for (j=0;j<6;j++){
                                                    System.out.print (t[i][j]+" ");
                                                        }
                                                            }
                                                                System.out.println ();
 }

        
}
    


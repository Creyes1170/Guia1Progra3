/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia1.varycond;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author DELL-5567
 */
public class Entrada {  

    public static int entero;
    

     public static String inicializar(){
     String buzon="";
     InputStreamReader flujo = new InputStreamReader(System.in);
     BufferedReader teclado = new BufferedReader(flujo);
     try{
        buzon=teclado.readLine();
        }
     catch(Exception e){
        System.out.append("Entrada incorrecta)");
        }
     return buzon;
     }
     
     public static int entero(){
     int valor = Integer.parseInt(inicializar());
     return valor;
     }
     public static double real(){
     double valor=Double.parseDouble(inicializar());
     return valor;
     }
     public static String cadena(){
     String valor=inicializar();
     return valor;
     }
     public static char caracter(){
     String valor=inicializar();
     return valor.charAt(0);
     }

    
}

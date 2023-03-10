/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia1;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio3Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.next();
        System.out.println("Frase mayuscula: " + frase.toUpperCase() );
        System.out.println("Frase miniscula: " + frase.toLowerCase() );
    }
}

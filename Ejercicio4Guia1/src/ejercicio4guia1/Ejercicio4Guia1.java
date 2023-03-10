/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia1;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio4Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner read=new Scanner(System.in);
        float grados;
        System.out.println("Ingrese los grados del dia de hoy: ");
        grados=read.nextFloat();
        grados=32+(9*grados/5);
        System.out.println("Lo pasamos grados Fahrenheit y es: " + grados);
    }
    
}

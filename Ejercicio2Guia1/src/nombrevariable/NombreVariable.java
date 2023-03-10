/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrevariable;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class NombreVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un nombre");
        nombre = leer.next();
        System.out.println("El nombre es: " + nombre);    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se llama “ XXXXXX y
       tiene XX años de edad”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        Scanner miEscanerNuevo = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad= miEscanerNuevo.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre= miEscanerNuevo.nextLine();
        System.out.println("Usted se llama " + nombre + "y tiene " + edad + " años de edad");
    }
    
}

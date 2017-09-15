/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje
     * Su nombre es XXX y XXX es su apellido.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        Scanner miEscanerNuevo = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre= miEscanerNuevo.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido= miEscanerNuevo.nextLine();
        System.out.println("Su nombre es " + nombre);
        System.out.println(apellido + " es su apellido");
    }
    
}

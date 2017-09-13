/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouno;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**int numeroUno;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numeroUno= miScanner.nextInt();
        System.out.println("El número " + numeroUno);*/
        
        int numeroUno;
        int numeroDos;
        int suma;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numeroUno= miScanner.nextInt();
        System.out.println("El número " + numeroUno);
        
        System.out.println("Ingrese el segundo número: ");
        numeroDos= miScanner.nextInt();
        System.out.println("El número " + numeroDos);
        
        suma = numeroUno + numeroDos;
        System.out.println("La suma es " + suma);
      
        
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * Se necesita pedir dos números y sumarlos, mostrar el resultado.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int suma;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numeroUno= miScanner.nextInt();
        //System.out.println("El número " + numeroUno);
        
        System.out.println("Ingrese el segundo número: ");
        numeroDos= miScanner.nextInt();
        //System.out.println("El número " + numeroDos);
        
        suma = numeroUno + numeroDos;
        System.out.println("La suma es " + suma);
    }
    
}

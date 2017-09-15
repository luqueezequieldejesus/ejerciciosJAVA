/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * Se piden tres números e informar el promedio.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int suma;
        int promedio;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        numeroUno= miScanner.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        numeroDos= miScanner.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        numeroTres= miScanner.nextInt();
        
        suma = numeroUno + numeroDos + numeroTres;
        promedio = suma / 3;
        
        System.out.println("El promedio es " + promedio);
        
    }
    
}

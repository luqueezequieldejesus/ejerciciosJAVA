/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     * Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
       informar cuanto le corresponde de sueldo, restándole el 15% de aportes.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horaTrabajo;
        int horasTrabajadas;
        int multiplicacion;
        double sueldo;
        double sueldoTotal;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la hora trabajada: ");
        horaTrabajo= miScanner.nextInt();
        
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas= miScanner.nextInt();
        
        multiplicacion = horaTrabajo * horasTrabajadas;
        sueldo = multiplicacion * 0.15;
        sueldoTotal = multiplicacion - sueldo;
        
        System.out.println("El sueldo es " + sueldoTotal);
        
        
    }
    
}

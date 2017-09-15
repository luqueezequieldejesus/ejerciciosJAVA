/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     * Se pide el largo y ancho de un terreno u se pide la superficie del mismo.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largo;
        int ancho;
        int superficie;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el largo: ");
        largo= miScanner.nextInt();
        
        System.out.println("Ingrese el ancho: ");
        ancho= miScanner.nextInt();
        
        superficie = largo * ancho;
        
        System.out.println("El promedio es " + superficie);
        
        
    }
    
}

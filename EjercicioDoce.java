/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
       internos.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int importeProducto;
        double impuestos;
        double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del producto importado: ");
        importeProducto= miScanner.nextInt();
        
        impuestos = importeProducto * 0.35;
        total = importeProducto + impuestos;
        
        System.out.println("El precio final del producto es " + total);
        
        
    }
    
}

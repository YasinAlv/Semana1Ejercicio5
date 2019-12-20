/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double Radio, Area;
        
        System.out.println("Digite el radio del circulo: ");
        Radio = Teclado.nextDouble();
        
        Area = Math.PI * Math.pow(Radio,2);
        
        System.out.println("El área del Circulo es: "+Area);
    }
    
}

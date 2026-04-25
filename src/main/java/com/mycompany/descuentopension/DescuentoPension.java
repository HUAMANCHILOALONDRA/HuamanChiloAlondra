/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuentopension;

import java.util.Scanner;

/**
 *
 * @author ahuam
 */
public class DescuentoPension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingreso su pension base: ");
        double pension = sc.nextDouble();
        
        System.out.println("Ingrese su promedio: ");
        double promedio = sc.nextDouble();
        
        System.out.println("Va a pagar al Contado? 1 = Si / 2 = No");
        int contado = sc.nextInt();
        
        double descuento = 0;
        
        if (promedio>=18){
            descuento = 0.20;
        } else if (promedio>=15){
            descuento = 0.10;
        } else if (promedio >=13) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }
        
        double montoDescuento = pension*descuento;
        
        double bono;
        if (contado == 1){
            bono = 50;
        }else{
            bono = 0;
        }
        double total = pension - montoDescuento - bono;
        
        System.out.println("\n--- DESGLOSE DE MATRICULA ---");
        System.out.printf("Su pension base es: S/ %.2f\n", pension);
        System.out.printf("Su descuento es: S/ %.2f\n", montoDescuento);
        System.out.printf("El bono al contado es: S/%.2f\n", bono);
        System.out.printf("El monto total es: S/ %.2f\n", total);
    }
}
    
          

     


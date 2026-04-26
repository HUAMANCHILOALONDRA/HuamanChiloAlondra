/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casacambio;

import java.util.Scanner;

/**
 *
 * @author ahuam
 */
public class CasaCambio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en soles: ");
        double soles = sc.nextDouble();
        
        System.out.println("\n Seleccione la moneda a cambio");
        System.out.println("1: Dolares (USD)");
        System.out.println("2: Euro (EUR)");
        System.out.println("3: Libras (GBP)");
        System.out.println("4: Pesos mexicanos (MXN)");
        System.out.println("Opcion: ");
        int opcion = sc.nextInt();
        
        double resultado = 0;
        String moneda = "";
        
        switch (opcion){
            case 1 -> {
                resultado = soles*0.27;
                moneda = "USD";
            }
            case 2 -> {
                resultado = soles*0.25;
                moneda = "EUR";
            }
            case 3 -> { 
                resultado = soles*0.21;
                moneda = "GBP";
            }
            case 4 -> {
                resultado = soles*4.50;
                moneda = "MXN";
            }
            default -> {
                System.out.println("Moneda no disponible");
                return;
            }
        }
        System.out.printf("Resultado: %.2f Soles equivalen a %.2f %s\n", soles, resultado, moneda);
    }  
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese las horas 0-23: ");
        int h = sc.nextInt();
        
        System.out.println("Ingrese los minutos 0-59: ");
        int m = sc.nextInt();
        
        System.out.println("Ingrese los segundos 0-59: ");
        int s = sc.nextInt();
        
        //desarrollo
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59){
            System.out.println("Error");
            
        }else{
            s++;
            if (s > 59){
                s = 0;
                m++;         
            }
            if (m > 59){
                m = 0;
                h++;
            }
            if (h > 23) {
                h = 0;
            }
            System.out.printf("La siguiente hora es: %02d:%02d:%02d\n", h, m, s);
        }
    }
}      
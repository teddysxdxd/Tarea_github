/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_github;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Tarea_Github {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

 
        System.out.print("Ingresa el primer numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int n2 = scanner.nextInt();

        
        Suma suma = new Suma(n1, n2);

        
        int resultado = suma.sumar();
        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + resultado);
    }
}


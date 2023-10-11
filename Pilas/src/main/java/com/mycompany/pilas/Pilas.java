/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilas;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Pilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorLlamadas gestor = new GestorLlamadas();
        int opcion;

        while (true) {
            System.out.println("");
            System.out.println("Gestor de llamadas:");
            System.out.println("1. Iniciar llamada");
            System.out.println("2. Colgar llamada");
            System.out.println("3. Llamada en proceso");
            System.out.println("4. Cantidad total de llamadas");
            System.out.println("5. ¿Hay llamadas?");
            System.out.println("6. Mostrar llamadas pendientes");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = gestor.sc.nextInt();
            gestor.sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.nuevaLlamada();
                    break;
                case 2:
                    gestor.colgarLlamada();
                    break;
                case 3:
                    gestor.ultimaLlamada();
                    break;
                case 4:
                    gestor.totalLlamadas();
                    break;
                case 5:
                    gestor.estaVacia();
                    break;
                case 6:
                    gestor.llamadasPendientes();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }   
        }
    }
}

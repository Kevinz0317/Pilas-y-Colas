/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.colas;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdministrarTurnos admin = new AdministrarTurnos();
        int opcion;

        while (true) {
            System.out.println("");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Tomar un turno");
            System.out.println("2. Atender siguiente turno");
            System.out.println("3. Ver lista de turnos");
            System.out.println("4. Cantidad total de turnos");
            System.out.println("5. ¿Hay turnos?");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = admin.sc.nextInt();
            admin.sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del paciente: ");
                    String nombre = admin.sc.nextLine();
                    System.out.print("Número de documento: ");
                    int documento = admin.sc.nextInt();
                    admin.sc.nextLine();
                    System.out.print("Tipo de cita médica: ");
                    String tipoCita = admin.sc.nextLine();
                    admin.agregarTurno(nombre, documento, tipoCita);
                    break;
                case 2:
                    admin.atenderTurno();
                    break;
                case 3:
                    admin.mostrarTurnos();
                    break;
                case 4:
                    int totalTurnos = admin.cantidadTotalTurnos();
                    System.out.println("Total de turnos asignados: " + totalTurnos);
                    break;
                case 5:
                    admin.estaVacia();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }   
        }
    }
}

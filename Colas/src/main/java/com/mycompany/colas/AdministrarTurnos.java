/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class AdministrarTurnos {

    private Queue<Turnos> colaTurnos = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    private int numeroTurno = 1;

    public void agregarTurno(String nombre, int documento, String tipoCita) {
        Turnos nuevoTurno = new Turnos(nombre, documento, numeroTurno, tipoCita);
        colaTurnos.add(nuevoTurno);
        System.out.println("Se ha asignado el Turno #" + numeroTurno);
        numeroTurno++;
    }

    public Turnos atenderTurno() {
        Turnos turnoActual = colaTurnos.poll();
        if (turnoActual != null) {
            System.out.println("Siguiente turno: " + turnoActual.impresionTurnos());
        } else {
            System.out.println("No hay turnos pendientes en la cola.");
        }
        return turnoActual;
    }

    public void mostrarTurnos() {
        if (colaTurnos.isEmpty()) {
            System.out.println("No hay turnos para mostrar.");
        } else {
            System.out.println("Lista de turnos asignados:");
            for (Turnos turno : colaTurnos) {
                System.out.println(turno.impresionTurnos());
            }
        }
    }

    public int cantidadTotalTurnos() {
        return colaTurnos.size();
    }

    public boolean estaVacia() {
        if (colaTurnos.isEmpty()) {
            System.out.println("No hay turnos por atender.");
            return true;
        } else {
            System.out.println("Hay turnos por atender.");
            return false;
        }
    }
}

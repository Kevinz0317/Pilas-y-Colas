/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

/**
 *
 * @author kevin
 */
public class Turnos {
    private String nombre;
    private int documento;
    private int numTurno;
    private String tipoCita;

    public Turnos() {
    }

    public Turnos(String nombre, int documento, int numTurno, String tipoCita) {
        this.nombre = nombre;
        this.documento = documento;
        this.numTurno = numTurno;
        this.tipoCita = tipoCita;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public int getNumTurno() {
        return numTurno;
    }
    
    public String getTipoCita() {
        return tipoCita;
    }
    
    public String impresionTurnos(){
        return "Turno #" + numTurno + " \n- Nombre: " + nombre + "\n- Documento: " + documento + "\n- Cita: " + tipoCita + "\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author kevin
 */
public class Llamada {
    private long numero;
    private int extension;
    private String destinatario;

    public Llamada(long numero, int extension, String destinatario) {
        this.numero = numero;
        this.extension = extension;
        this.destinatario = destinatario;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Llamada:\n" + " - Numero: " + numero + "\n - Extension:" + extension + "\n - Destinatario:" + destinatario + '\n';
    }
    
    
}

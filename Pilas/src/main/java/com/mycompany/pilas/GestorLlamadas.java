/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class GestorLlamadas {
    private Stack<Llamada> llamadas = new Stack<>();
    Scanner sc = new Scanner(System.in);
    
    public void nuevaLlamada(){
        System.out.print("Destinatario: ");
        String nombre = sc.next();
        System.out.print("Numero: ");
        long numero = sc.nextLong();
        System.out.print("Extension: ");
        int extension = sc.nextInt();
        Llamada temp = new Llamada(numero, extension, nombre);
        llamadas.push(temp);
        try {
            if(llamadas.size()==1)
                System.out.println("Llamando...");
            else{
                System.out.println("Llamada en espera...");
                Thread.sleep(500);
                System.out.println("Llamando...");
            }
            Thread.sleep(2000);
            System.out.println("Llamada iniciada.");
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(GestorLlamadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void colgarLlamada(){
        llamadas.pop();
        System.out.println("Llamada finalizada...");
    }
    
    public void totalLlamadas(){
        System.out.println("Total de llamadas en proceso: " + llamadas.size());
    }
    
    public boolean estaVacia() {
        if (llamadas.isEmpty()) {
            System.out.println("No hay llamadas por atender.");
            return true;
        } else {
            System.out.println("Hay llamadas por atender.");
            return false;
        }
    }
    
    public void ultimaLlamada(){
        if (llamadas.isEmpty()) {
            System.out.println("No hay ninguna llamada en proceso.");
        } else {
            Llamada temp = llamadas.peek();
            System.out.println("Llamada en proceso\n" + "- Nombre: " + temp.getDestinatario() + "\n- Numero: " + temp.getNumero() + "\n- Extensión: " + temp.getExtension());
        }
    }
    
    public void llamadasPendientes() {
        if (llamadas.isEmpty()) {
            System.out.println("No hay llamadas pendientes.");
        } else {
            System.out.println("Llamadas por atender:");
            for (Llamada temp : llamadas) {
                System.out.println(temp.toString());
            }
        }
    }
}
package listaaleatoria;

/* Autor: Alejandro Pérez Durán.
 * Fecha de creación: 30 de Septiembre de 2014.
 */

import java.io.*;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada); // crea nuevo nodo
        nuevo.enlace = primero;
        System.out.print("El enlace: " + nuevo.enlace);
        System.out.println(" El dato es: " + nuevo.dato);
        primero = nuevo;
        System.out.print("El enlace primero es: " + primero.enlace);
        System.out.println("El dato primero es: " + primero.dato);
        return this;
    }

    public void visualizar() {
        Nodo n;
        n = primero;
        System.out.println("Dirección del primero: " + n);
        while (n != null) {
            System.out.print("dato: " + n.dato + " ");
            System.out.println("direccción: " + n.enlace + " ");
            n = n.enlace;
        }
    }
}
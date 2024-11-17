/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class NodoL {

    private NodoL siguienteNodo;

    public NodoL(DatoL dato) {
        this.dato = dato;
    }

    private DatoL dato;

    public NodoL getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoL siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public DatoL getDato() {
        return dato;
    }

    public void setDato(DatoL dato) {
        this.dato = dato;
    }

}

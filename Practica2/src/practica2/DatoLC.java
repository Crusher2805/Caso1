/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * 
 */
public class DatoLC {

    public Compra dato;
    public DatoLC siguiente;
    public DatoLC anterior;

    public DatoLC(Compra dato) {
        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;
    }

}

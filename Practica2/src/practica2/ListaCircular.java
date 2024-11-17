/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class ListaCircular {

    private DatoLC cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public void agregar(Compra compra) {
        DatoLC nuevo = new DatoLC(compra);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            DatoLC ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    public void ordenarExento() {
        if (cabeza == null) {
            return;
        }

        DatoLC actual = cabeza;
        do {
            DatoLC siguiente = actual.siguiente;
            while (siguiente != cabeza) {
                if (actual.dato.isExento() && !siguiente.dato.isExento()) {

                    Compra temp = actual.dato;
                    actual.dato = siguiente.dato;
                    siguiente.dato = temp;
                }
                siguiente = siguiente.siguiente;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("La lista no tiene elementos");
            return;
        }

        DatoLC actual = cabeza;
        do {
            System.out.println(actual.dato.toString());
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

}

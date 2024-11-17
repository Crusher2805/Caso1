/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class ListaDobleCircular {

    private DatoLDC cabeza;

    public ListaDobleCircular() {
        this.cabeza = null;
    }

    public void agregar(Perfil perfil) {
        DatoLDC nuevo = new DatoLDC(perfil);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            DatoLDC ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    public void ordenarAlfabeticamente() {
        if (cabeza == null || cabeza.siguiente == cabeza) {
            return;
        }
        boolean alreves;
        do {
            alreves = false;
            DatoLDC actual = cabeza;
            do {
                DatoLDC siguiente = actual.siguiente;
                if (actual.dato.comparar(siguiente.dato) > 0) {

                    Perfil temp = actual.dato;
                    actual.dato = siguiente.dato;
                    siguiente.dato = temp;
                    alreves = true;
                }
                actual = siguiente;
            } while (actual != cabeza);
        } while (alreves);
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("La lista no tiene elementos ");
            return;
        }

        DatoLDC actual = cabeza;
        do {
            System.out.println(actual.dato.toString());
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * 
 */
public class ListaS {

    private DatoL cabeza;

    public ListaS() {
        this.cabeza = null;
    }

    
    public void agregar(Venta venta) {
        DatoL nuevo = new DatoL(venta);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    
    public void mayorTotal() {
        if (cabeza == null) {
            System.out.println("La lista no tiene elementos ");
            return;
        }

        DatoL actual = cabeza;
        DatoL mayor = cabeza;

        while (actual != null) {
            if (actual.dato.calcularTotal() > mayor.dato.calcularTotal()) {
                mayor = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("Dato con el mayor total " + mayor.dato.toString());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaS lista = new ListaS();
        lista.agregar(new Venta(10000.0, 10.0, 5));
        lista.agregar(new Venta(3000.0, 20.0, 4));
        lista.agregar(new Venta(4000.0, 15.0, 6));

        lista.mayorTotal();

        ListaCircular listaC = new ListaCircular();
        listaC.agregar(new Compra(100.0, true, 0.0));
        listaC.agregar(new Compra(200.0, false, 20.0));
        listaC.agregar(new Compra(3000.0, true, 0.0));
        listaC.agregar(new Compra(400.0, false, 25.0));

        System.out.println("Lista sin ordenar ");
        listaC.imprimirLista();

        listaC.ordenarExento();

        System.out.println("\nLista ordenada ");
        listaC.imprimirLista();

        ListaDobleCircular listaDC = new ListaDobleCircular();
        listaDC.agregar(new Perfil("Keren", "cassa"));
        listaDC.agregar(new Perfil("Key", "Gomez"));
        listaDC.agregar(new Perfil("Mile", "Bella"));
        listaDC.agregar(new Perfil("Ari", "Rodriguez"));

        System.out.println("Lista sin ordenar ");
        listaDC.imprimirLista();

        listaDC.ordenarAlfabeticamente();

        System.out.println("\nLista ordenada ");
        listaDC.imprimirLista();
    }

}

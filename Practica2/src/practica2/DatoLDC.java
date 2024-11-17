/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 *
 */
public class DatoLDC {

    public Perfil dato;
    public DatoLDC siguiente;
    public DatoLDC anterior;

    
    public DatoLDC(Perfil dato) {
        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * 
 */
public class Perfil {

    private String nombre;
    private String apellido;

    public Perfil() {
        this.nombre = "";
        this.apellido = "";
    }

    
    public Perfil(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
    @Override
    public String toString() {
        return "Nombre " + nombre + ", Apellido " + apellido;
    }

    public int comparar(Perfil otro) {
        int apellidoC = this.apellido.compareTo(otro.apellido);
        if (apellidoC == 0) {
            return this.nombre.compareTo(otro.nombre);
        }
        return apellidoC;
    }

}

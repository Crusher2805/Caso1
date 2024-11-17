/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.casocs1;
import java.util.List;

/**
 *
 * 
 */
public interface GestionBaseDatos {
    
    //Creacion de los metodos de interfaz que las clases van a implementar

   void guardarEnBaseDeDatos();

    void modificarEnBaseDeDatos(int id, String nuevoNombre);

    List<Producto> consultarProductos();

    List<Empleado> consultarEmpleados();

    List<Cliente> consultarClientes();

    List<Venta> consultarVentas();
}


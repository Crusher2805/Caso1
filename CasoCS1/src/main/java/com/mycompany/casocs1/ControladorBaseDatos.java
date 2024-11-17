/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casocs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class ControladorBaseDatos implements GestionBaseDatos{
    private static final String URL = "jdbc:sqlite:supermercado.db";

    @Override
    public void guardarEnBaseDeDatos() {
        // Implementación para guardar en base de datos
    }

    @Override
    
    //metodos de consulta a la base de datos usando el id, nombre y precio
    public List<Producto> consultarProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getDouble("precio"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return productos;
    }

    @Override
    
    // Igual al anterior, solo que este metodo devuelve una lista de empleado
    public List<Empleado> consultarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Empleado empleado = new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getString("puesto"));
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return empleados;
    }

    @Override
    public List<Cliente> consultarClientes() {
        
        //Consulta la tabla clientes y devuelve una lista de cliente.
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("correo"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    @Override
    public List<Venta> consultarVentas() {
        
        //Consulta la tabla clientes y devuelve una lista de cliente.
        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM ventas";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Venta venta = new Venta(rs.getInt("id_producto"), rs.getInt("id_cliente"), rs.getInt("cantidad"));
                ventas.add(venta);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ventas;
    }


    @Override
    public void modificarEnBaseDeDatos(int id, String nuevoNombre) {
        
        //Este método actualiza el nombre de un producto en la base de datos utilizando su id
        String sql = "UPDATE productos SET nombre = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nuevoNombre);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarProducto(Producto producto) {
        
        //Inserta un nuevo producto en la tabla productos usando un insert
        String sql = "INSERT INTO productos (id, nombre, precio) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, producto.getId());
            pstmt.setString(2, producto.getNombre());
            pstmt.setDouble(3, producto.getPrecio());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        
        //Inserta un nuevo empleado en la tabla empleados
        String sql = "INSERT INTO empleados (id, nombre, puesto) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, empleado.getId());
            pstmt.setString(2, empleado.getNombre());
            pstmt.setString(3, empleado.getPuesto());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarCliente(Cliente cliente) {
        
        // Inserta un nuevo cliente en la tabla clientes.
        String sql = "INSERT INTO clientes (id, nombre, correo) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, cliente.getId());
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getCorreo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void registrarVenta(Venta venta) {
        
         //Inserta una nueva venta en la tabla ventas.
        String sql = "INSERT INTO ventas (id_producto, id_cliente, cantidad) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, venta.getIdProducto());
            pstmt.setInt(2, venta.getIdCliente());
            pstmt.setInt(3, venta.getCantidad());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
    


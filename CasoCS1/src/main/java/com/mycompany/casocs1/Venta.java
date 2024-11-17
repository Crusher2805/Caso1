/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casocs1;

/**
 *
 * 
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

//primero hacer los imports necesarios para usar los funcionalidades de SQL, luego crear los atributos
//de la clase venta, su contructor y sus metodos set y get
        

public class Venta {
    private int idProducto;
    private int idCliente;
    private int cantidad;

    public Venta(int idProducto, int idCliente, int cantidad) {
        this.idProducto = idProducto;
        this.idCliente = idCliente;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
//luego crear el metodo para inyectar datos a la tabla ventas tales como producto, cliente y cantidad
    public void registrarVenta() {
        String sql = "INSERT INTO ventas (id_producto, id_cliente, cantidad) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:supermercado.db");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idProducto);
            pstmt.setInt(2, idCliente);
            pstmt.setInt(3, cantidad);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
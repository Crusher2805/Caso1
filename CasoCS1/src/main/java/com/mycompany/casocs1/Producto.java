/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casocs1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 *
 */
public class Producto extends EntidadBase {
    
    //heredar de la clase abstracta entidadBase

    private double precio;

    public Producto(int id, String nombre, double precio) {
        super(id, nombre);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
//luego crear el metodo para inyectar datos a la tabla productos tales como precio, id y nombre

    @Override
    public void guardar() {
        String sql = "INSERT INTO productos (id, nombre, precio) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:supermercado.db"); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setDouble(3, precio);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

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
public class Cliente extends EntidadBase {
    private String correo;

    public Cliente(int id, String nombre, String correo) {
        super(id, nombre);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }
//creacion del metodo para inyectar datos a la tabla clientes tales como correo, id y nombre

    @Override
    public void guardar() {
        String sql = "INSERT INTO clientes (id, nombre, correo) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:supermercado.db");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, correo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


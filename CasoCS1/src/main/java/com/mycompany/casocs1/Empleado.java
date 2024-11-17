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
public class Empleado extends EntidadBase {

    private String puesto;

    public Empleado(int id, String nombre, String puesto) {
        super(id, nombre);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }
    
    //Herencia del metodo guardar de la clase entidadBase, igual sirve para inyectar los valores a la tabla empleados

    @Override
    public void guardar() {
        String sql = "INSERT INTO empleados (id, nombre, puesto) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:supermercado.db"); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, puesto);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

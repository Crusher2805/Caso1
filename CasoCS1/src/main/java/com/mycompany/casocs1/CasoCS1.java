/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.casocs1;

import javax.swing.*;

/**
 *
 *
 */
public class CasoCS1 {

    public static void main(String[] args) {
        ControladorBaseDatos controlador = new ControladorBaseDatos();

        SwingUtilities.invokeLater(() -> {
            new Interfaz(controlador);
        });
    }
}

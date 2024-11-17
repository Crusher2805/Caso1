/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casocs1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class Interfaz extends JFrame {
    
    //luego usar jframe para asi implementar una interfaz grafica para el usuario
    //mediante paneles, botones y campos de texto que se van modelando a nuestro gusto

   private ControladorBaseDatos controlador;

    public Interfaz(ControladorBaseDatos controlador) {
        this.controlador = controlador;
        setTitle("Sistema de Gestion de Supermercado");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelAgregar = new JPanel();
        panelAgregar.setLayout(new GridLayout(5, 2));

        JTextField txtNombreProducto = new JTextField();
        JTextField txtPrecioProducto = new JTextField();
        JButton btnAgregarProducto = new JButton("Agregar Producto");

        panelAgregar.add(new JLabel("Nombre del Producto "));
        panelAgregar.add(txtNombreProducto);
        panelAgregar.add(new JLabel("Precio del Producto "));
        panelAgregar.add(txtPrecioProducto);
        panelAgregar.add(btnAgregarProducto);

        btnAgregarProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombreProducto.getText();
                double precio = Double.parseDouble(txtPrecioProducto.getText());
                Producto producto = new Producto(0, nombre, precio); 
                controlador.agregarProducto(producto);
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
                txtNombreProducto.setText("");
                txtPrecioProducto.setText("");
            }
        });

        JPanel panelVisualizacion = new JPanel();
        JTextArea textAreaVisualizacion = new JTextArea(10, 40);
        textAreaVisualizacion.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaVisualizacion);
        panelVisualizacion.add(scrollPane);

        JButton btnMostrarProductos = new JButton("Mostrar Productos");
        btnMostrarProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaVisualizacion.setText(""); 
                List<Producto> productos = controlador.consultarProductos(); 
                for (Producto producto : productos) {
                    textAreaVisualizacion.append("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + "\n");
                }
            }
        });

        panelVisualizacion.add(btnMostrarProductos);

        // Agregar paneles a la ventana de jframe
        add(panelAgregar, BorderLayout.NORTH);
        add(panelVisualizacion, BorderLayout.CENTER);

        setVisible(true);
    }
}
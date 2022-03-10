package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame{
    private JButton insertarReserva;
    private JButton mostrarReservasButton;
    private JButton eliminarReservaButton;
    private JButton consultarReservaButton;
    private JButton salirButton;
    private JPanel panel1;
    private JButton modificarReservaButton;

    public Menu() {
        super("RESERVAS DEL HOTEL");
        ArrayList<Cliente>listadoReservas = new ArrayList<>();
        setContentPane(panel1);

        insertarReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            ArrayMethods.añadirReserva();
            /*
            Writing escritura = new Writing();
            escritura.escribirObxectos("listadoDeReservas.txt");
             */
            }
        });

        mostrarReservasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                ArrayMethods.mostrarReservas(listadoReservas);
            }
        });

        eliminarReservaButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

        consultarReservaButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

        modificarReservaButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

        salirButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    }


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


    public Menu() {
        super("RESERVAS DEL HOTEL");
        ArrayList<Cliente>listadoReservas = new ArrayList<>();
        setContentPane(panel1);

        insertarReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            ArrayMethods.añadirReserva(listadoReservas);
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
                ArrayMethods.eliminarReservas(listadoReservas);
            }
        });

        consultarReservaButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ArrayMethods.consultarReservas(listadoReservas);
            }
        });



        salirButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    }


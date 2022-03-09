package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame{
    private JButton button1;
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
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ArrayMethods.añadirReserva();
            }
        });
        mostrarReservasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ArrayMethods.mostrarReservas(listadoReservas);
            }
        });


    }
}

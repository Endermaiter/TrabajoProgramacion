package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame{
    private JButton button1;
    private JButton mostrarReservasButton;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel1;

    public Menu() {
        super("RESERVAS DEL HOTEL");
        ArrayList<Cliente>listadoReservas = new ArrayList<>();
        setContentPane(panel1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ArrayMethods.añadirReserva(listadoReservas);
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

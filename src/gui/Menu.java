package gui;

import Clases.ArrayMethods;
import Clases.Cliente;

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
        ArrayMethods arrayM = new ArrayMethods();

        insertarReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro gui = new Registro(listadoReservas);
                gui.setVisible(true);
                gui.setSize(750,950);
                gui.setLocationRelativeTo(null);
            }
        });

        mostrarReservasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                arrayM.mostrarReservas(listadoReservas);
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


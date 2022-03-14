package gui;

import com.company.ArrayMethods;
import com.company.Cliente;

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
                Registro gui = new Registro();
                gui.setVisible(true);
                gui.setSize(1000,1000);
            /*
            ArrayMethods.añadirReserva(listadoReservas);
            Writing escritura = new Writing();
            escritura.escribirObxectos("listadoDeReservas.txt");
             */
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


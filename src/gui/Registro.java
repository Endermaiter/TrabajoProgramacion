package gui;

import com.company.ArrayMethods;
import com.company.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registro extends JFrame {


    private JTextField textFieldDNI;
    private JTextField textFieldNombre;
    private JTextField textFieldTelefono;
    private JTextField textFieldDireccion;
    private JTextField textFieldCorreo;
    private JTextField textFieldNHabitacion;
    private JTextField textFieldTHabitacion;
    private JTextField textFieldTCamas;
    private JTextField textFieldVIP;
    private JTextField textFieldGaraje;
    private JButton registrarReservaButton;
    private JLabel mensajeLabel;
    private JPanel panel2;

    public Registro() {
        super("REGISTRO");
        setContentPane(panel2);
        registrarReservaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ArrayMethods arrayM = new ArrayMethods();

                String dni = textFieldDNI.getText();
                String nombre = textFieldNombre.getText();
                int telefono = Integer.parseInt(textFieldTelefono.getText());
                String direccion = textFieldDireccion.getText();
                String correo = textFieldCorreo.getText();
                int numeroHabitacion = Integer.parseInt(textFieldNHabitacion.getText());
                String tipoHabtacion = textFieldTHabitacion.getText();
                String tipoCamas = textFieldTCamas.getText();
                boolean vip = Boolean.parseBoolean(textFieldVIP.getText());
                boolean garaje = Boolean.parseBoolean(textFieldGaraje.getText());
                arrayM.añadirReserva(dni,nombre,telefono,direccion,correo,numeroHabitacion,tipoHabtacion,tipoCamas,vip,garaje);
                mensajeLabel.setText("¡Cliente registrado correctamente!");
            }
        });
    }
}

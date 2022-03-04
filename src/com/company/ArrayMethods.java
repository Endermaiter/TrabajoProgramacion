package com.company;

import marcos.pack.LerDatos;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayMethods {
    ArrayList<Cliente> reservas = new ArrayList<Cliente>();

    public void añadirReserva(ArrayList<Cliente>reservas){
        reservas.add(new Cliente(LerDatos.lerString("Inserte el DNI:"),
                                 LerDatos.lerString("Inserte el nombre:"),
                                 LerDatos.lerInt("Inserte el TLF:"),
                                 LerDatos.lerString("Inserte la direccion:"),
                                 LerDatos.lerString("Inserte el correo electronico:"),
                                 LerDatos.lerInt("Inserte el numero de habitaciones:"),
                                 LerDatos.lerString("Inserte el tipo de habitacion"),
                                 LerDatos.lerString("Inserte el tipo de camas:"),
                                 LerDatos.lerBoolean("¿El cliente es VIP? (true/false)"),
                                 LerDatos.lerBoolean("¿El cliente usara la plaza de garaje? (true/false)")));

    }
}

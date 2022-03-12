package com.company;

import marcos.pack.LerDatos;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayMethods{

    static  Cliente  cli ;

    public static ArrayList<Cliente> añadirReserva(ArrayList<Cliente>reservas){

        reservas.add(new Cliente(LerDatos.lerString("Inserte el DNI:"),
                                 LerDatos.lerString("Inserte el nombre:"),
                                 LerDatos.lerInt("Inserte el TLF:"),
                                 LerDatos.lerString("Inserte la direccion:"),
                                 LerDatos.lerString("Inserte el correo electronico:"),
                                 LerDatos.lerInt("Inserte el numero de habitacion:"),
                                 LerDatos.lerString("Inserte el tipo de habitacion"),
                                 LerDatos.lerString("Inserte el tipo de camas:"),
                                 LerDatos.lerBoolean("¿El cliente es VIP? (true/false)"),
                                 LerDatos.lerBoolean("¿El cliente usara la plaza de garaje? (true/false)")));
        return reservas;
    }

    public static void mostrarReservas(ArrayList<Cliente>reservas){
        for(int i=0; i< reservas.size(); i++){
            JOptionPane.showMessageDialog(null, reservas.get(i));
     }
    }


public  static  ArrayList<Cliente>  eliminarReservas(ArrayList<Cliente>reservas){

     String pedirDni= JOptionPane.showInputDialog("Inserte el dni registrado en la reserva  que desea eliminar:") ;
     for (int i = 0; i<reservas.size();i++){
if (cli.getDni()==pedirDni ){
   reservas.remove(i);
}
else {
    JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva");
}
     }
return reservas;
}

public static  ArrayList<Cliente> consultarReservas (ArrayList<Cliente>reservas){
    String pedirDni= JOptionPane.showInputDialog("Inserte el dni registrado en la reserva  que desea consultar:") ;
        for (int i = 0; i<reservas.size();i++){
       if (pedirDni==cli.getDni())    {
       JOptionPane.showMessageDialog(null,reservas.get(i));
       }
       else {
           JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva")  ;
       }

        }

return reservas ;
}



}

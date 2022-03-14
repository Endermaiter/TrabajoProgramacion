package com.company;

import marcos.pack.LerDatos;

import javax.swing.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ArrayMethods{

    static  Cliente  cli ;

    public static ArrayList<Cliente> añadirReserva(ArrayList<Cliente>reservas, String dni,String nombre,int telefono,String direccion, String correoElectronico,int numeroHabitacion,String tipoHabitacion,String tipoCamas,boolean vip,boolean garaje){
        reservas.add(new Cliente(dni,nombre,telefono,direccion,correoElectronico,numeroHabitacion,tipoHabitacion,tipoCamas,vip,garaje));
        return reservas;
    }

    public static void mostrarReservas(ArrayList<Cliente>reservas){
        System.out.println("DNI             NOMBRE             TELEFONO             DIRECCION             CORREO ELECTRONICO             NUMERO HABITACIONES              TIPO DE HABITACION             TIPO DE CAMAS              VIP              GARAJE");
        for(int i=0; i< reservas.size(); i++){
            System.out.println(reservas.get(i));
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

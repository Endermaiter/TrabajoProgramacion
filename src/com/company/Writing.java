package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writing {

    FileWriter fich;


    public  void escribirObxectos(String nomeFicheiro){
        try {
            ArrayList<Cliente>listadoReservas = ArrayMethods.añadirReserva();
            fich = new FileWriter("listadoDeReservas.txt");
            fich.write("DNI    NOMBRE    TELEFONO    DIRECCION    CORREO ELECTRONICO    NUMERO HABITACIONES    TIPO DE HABITACION    TIPO DE CAMAS    VIP    GARAJE\n");
            for(Cliente cli:listadoReservas){
                fich.write(cli.getDni()+"    "+cli.getNombre()+"    "+cli.getTelefono()+"    "+cli.getDireccion()+"   "+cli.getCorreoElectronico()+"    "+cli.getNumeroHabitacion()+"    "+cli.getTipoHabitacion()+"    "+cli.getTipoCamas()+"    "+cli.isVip()+"    "+cli.isGaraje()+"\n");
            }
        } catch (IOException e) {
            System.out.println("Error de escritura 1" + e.getMessage());
        }
        finally {
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("Imposible cerrar el archivo");
            }
        }
    }







}

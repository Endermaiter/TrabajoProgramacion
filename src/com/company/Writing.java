package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writing {

    FileWriter fich;
    PrintWriter escribir;

    public  void escribirObxectos(String nomeFicheiro){
        try {
            ArrayList<Cliente>listadoReservas = ArrayMethods.añadirReserva();
            fich = new FileWriter("listado de reservas.txt",true);
            for(Cliente cli:listadoReservas){
                fich.write(cli.getDni()+"    "+cli.getNombre()+"    "+cli.getTelefono()+"    "+cli.getDireccion()+"   "+cli.getCorreoElectronico()+"    "+cli.getNumeroHabitacion()+"    "+cli.getTipoHabitacion()+"    "+cli.getTipoCamas()+"    "+cli.isVip()+"    "+cli.isGaraje());
            }

        } catch (IOException e) {
            System.out.println("Erro de escritura 3" + e.getMessage());
        }
        finally {
            escribir.close();
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("Imposible cerrar el archivo");
            }
        }
    }







}

package com.company;

import marcos.pack.LerDatos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente>listadoReservas = new ArrayList<>();

        String[]titulos = {"DNI  ","  NOMBRE  ","  TELEFONO  ","  DIRECCION  ","  CORREO ELECTRONICO  ","  NUMERO HABITACIONES  ","  TIPO DE HABITACION  ","  TIPO DE CAMAS  ","  VIP  ","  GARAJE"};

        int opcion;

        do {
            opcion = LerDatos.lerInt("RESERVAS DE HOTEL\n 1.Insertar reserva. \n 2.Mostrar reservas. \n 3.Eliminar reserva. \n 4.Consultar reserva.\n 5.Modificar Reserva. \n 6.Salir");

            switch (opcion){
                case 1:
                    ArrayMethods.añadirReserva(listadoReservas);
                    break;
                case 2:
                    System.out.print("RESERVAS\n");
                    for(int i=0; i<titulos.length;i++){
                        System.out.print(titulos[i]);
                    }
                    ArrayMethods.mostrarReservas(listadoReservas);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        }while(opcion<10);
    }
}

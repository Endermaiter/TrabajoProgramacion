package com.company;

import marcos.pack.LerDatos;

public class Main {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = LerDatos.lerInt("RESERVAS DE HOTEL\n 1.Insertar reserva. \n 2.Mostrar reservas. \n 3.Eliminar reserva. \n 4.Consultar reserva.\n 5.Salir ");

            switch (opcion){
                case 1:
                    break;
                case 2:
                    System.out.print("RESERVAS");
                    //LLAMAMOS AL METODO ARRAY STRING
                    //LLAMAMOS AL METODO AMOSAR ARRAYLIST
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }while(opcion<10);
    }
}

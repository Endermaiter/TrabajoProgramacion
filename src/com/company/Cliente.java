package com.company;

public class Cliente {
    private String dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private int numeroHabitacion; // solo puede coger una habitacion
    private String tipoHabitacion; //suit o normal
    private String tipoCamas; //doble, triple, unitaria...etc
    private boolean vip;
    private boolean garaje;

    public Cliente (){}

    public Cliente(String dni, String nombre, int telefono, String direccion, String correoElectronico, int numeroHabitacion, String tipoHabitacion, String tipoCamas, boolean vip, boolean garaje) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCamas = tipoCamas;
        this.vip = vip;
        this.garaje = garaje;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    @Override
    public String toString() {
        return  dni + "  " +
                nombre + "  " +
                telefono + "  " +
                direccion + "  " +
                correoElectronico + "  " +
                numeroHabitacion + "  " +
                tipoHabitacion + "  " +
                tipoCamas + "  " +
                vip + "  " +
                garaje;

    }
}


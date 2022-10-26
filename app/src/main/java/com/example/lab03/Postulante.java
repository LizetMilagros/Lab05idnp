package com.example.lab03;

public class Postulante {
    private String apePaterno, apeMaterno, nombres, dni, fecha, colegio, carrera;

    Postulante(String apePaterno, String apeMaterno, String nombres, String dni, String fecha, String colegio, String carrera){
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.nombres = nombres;
        this.dni = dni;
        this.fecha = fecha;
        this.colegio = colegio;
        this.carrera = carrera;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setDni(String dni) {
        this.fecha = dni;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getApePaterno() {
        return apePaterno;
    }
    public String getApeMaterno() {
        return apeMaterno;
    }
    public String getNombres() { return nombres; }
    public String getDni() {
        return dni;
    }
    public String getFecha() { return fecha;}
    public String getColegio() {return colegio;}
    public String getCarrera() {return carrera;}

    @Override
    public String toString() {
        return "\nApellido paterno: " + apePaterno +
                "\nApellido materno: " + apeMaterno +
                "\nNombres: " + nombres +
                "\nDni: " + dni +
                "\nFecha de nacimiento: " + fecha +
                "\nColegio de procedencia: " + colegio +
                "\nCarrera a la que postula: " + carrera;
    }
}

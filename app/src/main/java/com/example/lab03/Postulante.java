package com.example.lab03;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Postulante implements Parcelable, Serializable {
    private String apePaterno, apeMaterno, nombres, dni, fecha, colegio, carrera;

    Postulante(){
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.apePaterno);
        dest.writeString(this.apeMaterno);
        dest.writeString(this.nombres);
        dest.writeString(this.dni);
        dest.writeString(this.fecha);
        dest.writeString(this.colegio);
        dest.writeString(this.carrera);
    }

    public void readFromParcel(Parcel source) {
        this.apePaterno = source.readString();
        this.apeMaterno = source.readString();
        this.nombres = source.readString();
        this.dni = source.readString();
        this.fecha = source.readString();
        this.colegio = source.readString();
        this.carrera = source.readString();
    }

    protected Postulante(Parcel in) {
        this.apePaterno = in.readString();
        this.apeMaterno = in.readString();
        this.nombres = in.readString();
        this.dni = in.readString();
        this.fecha = in.readString();
        this.colegio = in.readString();
        this.carrera = in.readString();
    }

    public static final Parcelable.Creator<Postulante> CREATOR = new Parcelable.Creator<Postulante>() {
        @Override
        public Postulante createFromParcel(Parcel source) {
            return new Postulante(source);
        }

        @Override
        public Postulante[] newArray(int size) {
            return new Postulante[size];
        }
    };
}
